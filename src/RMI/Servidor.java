package RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

    public static void main (String[] args) {

        try{
            Registry conexao =

LocateRegistry.createRegistry(1500);// Serviço de nomes onde o servidor regista os objetos remotos e o cliente pesquisa a sua localização.

//            InterfaceCargo servicoCargo = new ServicoCargo();

//            InterfaceFuncionario servicoFuncionario = new ServicoFuncionario();

//            InterfacePagamento servicoPagamento = new ServicoPagamento();

//            conexao.bind("chave", servicoCargo);

//            conexao.bind("chave", servicoFuncionario);

//            conexao.bind("chave", servicoPagamento);

            System.out.println("Servidor iniciado.");
        }

        catch (RemoteException e) {

            System.out.println("Erro de conexão: " + e.getMessage());
        }

        catch (AlreadyBoundException e) {

            System.out.println("Erro na chamada do Serviço: " + e.getMessage());
        }
    }
}