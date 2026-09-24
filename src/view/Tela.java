package view;

import modelos.ModeloTabela;
import modelos.NomeCargo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tela extends JFrame {

    public Tela () {

        setTitle("Folha de pagamento");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(1000, 400);

        setLocationRelativeTo(null);

        List<Linha> linhas = new ArrayList<>();

        linhas.add(new Linha("Clayton", NomeCargo.Gerente, 8.5));

        linhas.add(new Linha("João", NomeCargo.Coordenador, 8.5));

        linhas.add(new Linha("Julia", NomeCargo.Professora, 8.5));

        ModeloTabela modeloTabela = new ModeloTabela(linhas);

        JTable tabela = new JTable(modeloTabela);
        
        tabela.setFillsViewportHeight(true);

        tabela.setRowHeight(25);

        tabela.getTableHeader().setReorderingAllowed(false); // Impede embaralhamento visual das linhas.

        tabela.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));

        JScrollPane scrollPane = new JScrollPane(tabela);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main (String[] args) {

        SwingUtilities.invokeLater(() -> { new Tela().setVisible(true); });
    }
}