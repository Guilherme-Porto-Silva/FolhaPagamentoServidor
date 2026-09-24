package modelos;

import java.io.Serializable;

public class Departamento implements Serializable {

    private int id;

    private String nome;

    public Departamento (Departamentos departamento) {

        nome = departamento.toString();
    }
}