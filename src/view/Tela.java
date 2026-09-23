package view;

import modelos.ModeloTabela;

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

//        linhas.add(new Linha(1, "Clayton", "Gerente", "TI", "R$ 4.000,00", "7:00", "18:00", "8,5%", "R$ 340,00", "R$ 3.660,00"));

//        linhas.add(new Linha(2, "João", "Coordenador", "Operações", "R$ 2.000,00", "7:00", "18:00", "8,5%", "R$ 170,00", "R$ 1.830,00"));

//        linhas.add(new Linha(3, "Julia", "Professora", "Educação", "R$ 1.300,00", "7:00", "18:00", "8,5%", "R$ 110,50", "R$ 1.189,50"));

        ModeloTabela modeloTabela = new ModeloTabela(linhas);

        JTable tabela = new JTable(modeloTabela);
        
        tabela.setFillsViewportHeight(true);

        tabela.setRowHeight(25);

        tabela.getTableHeader().setReorderingAllowed(false); // Impede embaralhamento visual das linhas

        tabela.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));

        JScrollPane scrollPane = new JScrollPane(tabela);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main (String[] args) {

        SwingUtilities.invokeLater(() -> { new Tela().setVisible(true); });
    }
}