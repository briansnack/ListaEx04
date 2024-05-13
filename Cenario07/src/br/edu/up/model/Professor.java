package br.edu.up.model;

public class Professor {
    private String nome;
    private String rg;
    private String matricula;
    private String lattes;
    private Titulacao titulacao;

    public Professor(String nome, String rg, String matricula, String lattes, Titulacao titulacao) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
        this.lattes = lattes;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLattes() {
        return lattes;
    }

    public void setLattes(String lattes) {
        this.lattes = lattes;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
}
