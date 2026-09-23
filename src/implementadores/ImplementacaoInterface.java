package implementadores;

import interfaces.Interface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ImplementacaoInterface extends UnicastRemoteObject implements Interface {

    public ImplementacaoInterface() throws RemoteException {}

    @Override public String olaMundo() throws RemoteException{

        return "Olá Mundo, Cliente!";
    }
}
