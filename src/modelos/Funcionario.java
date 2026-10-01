package modelos;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private int id;

    private String nome;

    private Cargo cargo;



    public Funcionario (String nomeFuncionario, Cargo cargoFuncionario) {

        nome = nomeFuncionario;

        cargo = cargoFuncionario;
    }

    @Override public String toString () {

        return "Funcionario " + nome + " - Cargo " + cargo.getNome();
    }

    public int getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public Cargo getCargo() {

        return cargo;
    }

    public double getSalario() {

        return cargo.getSalario();
    }



    public Object get (int coluna) {

        switch (coluna) {

            case 1 -> {
                return id;
            }

            case 2 -> {
                return nome;
            }

            case 3 -> {
                return getSalario();
            }

            default -> {
                return "O índice da coluna precisa ser maior que 0.";
            }
        }
    }
}