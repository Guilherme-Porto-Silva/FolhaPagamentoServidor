package RMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

    public static void main (String[] args) {

        try{
            Registry conexao = LocateRegistry.createRegistry(1500);

//            Interface servico = new ImplementacaoInterface();

//            InterfaceCalculadora servicoCalculadora = new Calculadora();

//            InterfaceProduto servicoProduto = new ImplementacaoInterfaceProduto();

//            conexao.bind("chave", servico);

//            conexao.bind("calculadora", servicoCalculadora);

//            conexao.bind("chaveProduto", servicoProduto);

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