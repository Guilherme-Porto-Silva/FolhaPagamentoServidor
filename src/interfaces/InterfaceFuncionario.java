package interfaces;

import java.rmi.Remote;

public interface InterfaceFuncionario extends Remote {

    boolean cadastrarFuncionario ();

    boolean demitirFuncionario (int funcionarioID, String justificativa);
}