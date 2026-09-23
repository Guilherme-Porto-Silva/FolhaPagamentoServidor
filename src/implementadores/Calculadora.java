package implementadores;

import interfaces.InterfaceCalculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements InterfaceCalculadora {

    public Calculadora() throws RemoteException {}

    @Override public float soma (float primeiroNumero, float segundoNumero) throws RemoteException {

        return primeiroNumero + segundoNumero;
    }

    @Override public float multiplicacao (float primeiroNumero, float segundoNumero) throws RemoteException {

        return primeiroNumero * segundoNumero;
    }
}