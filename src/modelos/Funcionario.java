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

    public Funcionario (String nomeFuncionario, NomeCargo nomeCargo, double salarioFuncionario, Departamento departamentoFuncionario, String horarioChegadaFuncionario, String horarioSaidaFuncionario) {

        nome = nomeFuncionario;

        cargo = new Cargo(nomeCargo, salarioFuncionario, departamentoFuncionario, horarioChegadaFuncionario, horarioSaidaFuncionario);
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

    public Departamento getDepartamento() {

        return cargo.getDepartamento();
    }

    public String getHorarioChegada() {

        return cargo.getHorarioChegada();
    }

    public String getHorarioSaida() {

        return cargo.getHorarioSaida();
    }
}