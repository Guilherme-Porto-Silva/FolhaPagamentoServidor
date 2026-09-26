package implementadores;

import RMI.Conexao;
import interfaces.InterfaceFuncionario;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicoFuncionario extends UnicastRemoteObject implements InterfaceFuncionario {

    public ServicoFuncionario () throws RemoteException {}

    private final Conexao LINK = new Conexao();

    private final String SQL_INSERIR_PRODUTO = "insert into produto (descricao, preco) values (?, ?)";
}