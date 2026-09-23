package modelos;

import java.io.Serializable;

public class Cargo implements Serializable {

    private int id;
    
    private double salario;
    
    private Departamento departamento;
    
    private String horarioChegada, horarioSaida;

    private NomeCargo nome;



    public Cargo (NomeCargo nomeCargo, double salarioCargo, Departamento departamentoCargo, String horarioChegadaCargo, String horarioSaidaCargo) {

        nome = nomeCargo;
        
        salario = salarioCargo;
        
        departamento = departamentoCargo;
        
        horarioChegada = horarioChegadaCargo;
        
        horarioSaida = horarioSaidaCargo;
    }



    protected double getSalario() {
        
        return salario;
    }

    protected Departamento getDepartamento() {
        
        return departamento;
    }

    protected String getHorarioChegada() {
        
        return horarioChegada;
    }

    protected String getHorarioSaida() {
        
        return horarioSaida;
    }
}