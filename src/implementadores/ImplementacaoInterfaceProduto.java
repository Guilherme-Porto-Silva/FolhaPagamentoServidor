package implementadores;

import RMI.Conexao;
import interfaces.InterfaceProduto;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import RMI.Produto;

public class ImplementacaoInterfaceProduto extends UnicastRemoteObject implements InterfaceProduto {
    
    private final String SQL_INSERIR_PRODUTO = "insert into produto (descricao, preco) values (?, ?)";

    private final Conexao LINK = new Conexao();

    @Override public boolean inserir (Produto p) throws RemoteException {

        try{
            LINK.conectar();

            PreparedStatement sentenca = LINK.link.prepareStatement(SQL_INSERIR_PRODUTO);

            sentenca.setString(1, p.getDescricao());

            sentenca.setFloat(2, p.getPreco());
            
            if (sentenca.execute()) return false;

            LINK.link.close();

            return true;
        }
        
        catch (Exception e) {

            System.out.println("\nDeu a seguinte merda: " + e.getMessage());

            return false;
        }
    }

    @Override public boolean editar (Produto p) throws RemoteException {

        return false;
    }

    @Override public boolean excluir (Produto p) throws RemoteException {

        return false;
    }

    @Override public Produto pesquisar (Produto p) throws RemoteException {

        return null;
    }

    @Override public ArrayList<Produto> selecionarTodos () throws RemoteException {

        return null;
    }

    public ImplementacaoInterfaceProduto () throws RemoteException {}
}