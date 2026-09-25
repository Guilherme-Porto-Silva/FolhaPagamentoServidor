package view;

import componentes.ModeloTabela;
import componentes.NomeCargo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tela extends JFrame {

    private final Scanner scanf = new Scanner(System.in);



    public Tela (

            List<String> nomes, List<NomeCargo> cargos, double aliquota,

            int largura, int altura, Component localizacaoRelativaA,

            boolean cobrirAlturaVisao, int alturaLinha,

            String fonte, int tamanhoLetras, String borda

    ) {

        setTitle("Folha de pagamento");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(largura, altura);

        setLocationRelativeTo(localizacaoRelativaA);

        List<Linha> linhas = new ArrayList<>();

        var quantasLinhas = nomes.size();

        for (int i = 0; i < quantasLinhas; i++) {

            Linha linha = new Linha(nomes.get(i), cargos.get(i), aliquota);

            linhas.add(linha);
        }

        ModeloTabela modeloTabela = new ModeloTabela(linhas);

        JTable tabela = new JTable(modeloTabela);
        
        tabela.setFillsViewportHeight(cobrirAlturaVisao);

        tabela.setRowHeight(alturaLinha);

        tabela.getTableHeader().setReorderingAllowed(false); // Impede embaralhamento visual das linhas.

        tabela.getTableHeader().setFont(new Font(fonte, Font.BOLD, tamanhoLetras));

        JScrollPane scrollPane = new JScrollPane(tabela);

        add(scrollPane, borda);

        this.setVisible(true);
    }



    public Tela criarTelaPadrao (int quantasLinhas) {

        List<String> nomes = new LinkedList<>();

        List<NomeCargo> cargos = new LinkedList<>();

        for (int i = 0; i < quantasLinhas; i++) {

            System.out.print("\n\nDigite um nome de funcionário: ");

            String nome = scanf.nextLine().strip().replace("  ", " ");

            nomes.add(nome);

            System.out.print(nome + """
                     pode assumir os cargos os cargos:
                     
                     1 - Gerente
                     
                     2 - Coordenador
                     
                     3 - Professora
                     
                     Digite um desses índices: """);

            var indiceCargo = Integer.parseInt(scanf.nextLine().strip());

            switch (indiceCargo) {

                case 1 -> cargos.add(NomeCargo.Gerente);

                case 2 -> cargos.add(NomeCargo.Coordenador);

                case 3 -> cargos.add(NomeCargo.Professora);
            }
        }

        System.out.println("Digite a alíquota do imposto: ");

        double aliquota = Double.parseDouble(scanf.nextLine().strip());

        return new Tela(nomes, cargos, aliquota, 1000, 400, null, true, 25, "SansSerif", 12, BorderLayout.CENTER);
    }
}