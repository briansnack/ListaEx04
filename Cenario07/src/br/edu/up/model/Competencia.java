package br.edu.up.model;

public class Competencia {
    private String nome;
    private boolean atingida;

    public Competencia(String nome, boolean atingida) {
        this.nome = nome;
        this.atingida = atingida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtingida() {
        return atingida;
    }

    public void setAtingida(boolean atingida) {
        this.atingida = atingida;
    }
}
