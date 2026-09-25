package view;

import modelos.Funcionario;
import componentes.NomeCargo;
import modelos.Pagamento;

public class Linha {

    private Funcionario pago;

    private Pagamento recebido;

    public Linha (String nome, NomeCargo cargo, double aliquota) {

        pago = new Funcionario(nome, cargo);

        recebido = new Pagamento(aliquota, pago.getSalario());
    }

    public Object get (int coluna) {

        if (coluna > 6) return recebido.get(coluna);

        return pago.get(coluna);
    }
}