package interfaces;

import java.rmi.Remote;

public interface InterfacePagamento extends Remote {

    double consultarPagamento (int funcionarioID);
}