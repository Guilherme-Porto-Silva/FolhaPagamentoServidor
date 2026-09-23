package view;

import modelos.Funcionario;
import modelos.Pagamento;

public class Linha {

    private Funcionario pago;

    private Pagamento recebido;

    public Linha(int id, String nome, String cargo, String setor, String salarioBase, String entrada, String saida, String aliquota, String valorDesconto, String salarioLiquido) {

        pago = new Funcionario(id, nome, cargo, setor, salarioBase, entrada, saida);

        recebido = new Pagamento(aliquota, valorDesconto, salarioLiquido);
    }
}