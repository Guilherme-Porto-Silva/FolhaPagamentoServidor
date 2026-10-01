package interfaces;

import java.rmi.Remote;
import java.util.List;

public interface InterfaceFuncionario extends Remote {

    boolean cadastrarFuncionario(String nome, String cpf, int cargoID);

    boolean demitirFuncionario(int funcionarioID, String justificativa);

    List<String> listarFuncionarios();

    boolean inserirCargo(String nome, double salario, int departamentoID);

    boolean inserirDepartamento(String nome);
}