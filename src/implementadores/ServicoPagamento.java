package implementadores;

import RMI.Conexao;
import interfaces.InterfacePagamento;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicoPagamento extends UnicastRemoteObject implements InterfacePagamento {

    public ServicoPagamento () throws RemoteException {}

    private final Conexao LINK = new Conexao();

    private final String SQL_INSERIR_PRODUTO = "insert into produto (descricao, preco) values (?, ?)";
}