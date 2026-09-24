package view;

import modelos.Funcionario;
import modelos.NomeCargo;
import modelos.Pagamento;

public class Linha {

    private Funcionario pago;

    private Pagamento recebido;

    public Linha (String nome, NomeCargo cargo, double aliquota) {

        pago = new Funcionario(nome, cargo);

        recebido = new Pagamento(aliquota, pago.getSalario());
    }
}