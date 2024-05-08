package br.edu.up.model;

public class Tripulacao {
    private String nomeTripulacao;
    private String rgTripulacao;
    private String identificacao;
    private int matricula;

    public Tripulacao(String nomeTripulacao, String rgTripulacao, String identificacao, int matricula) {
        this.nomeTripulacao = nomeTripulacao;
        this.rgTripulacao = rgTripulacao;
        this.identificacao = identificacao;
        this.matricula = matricula;
    }

    public String getNomeTripulacao() {
        return nomeTripulacao;
    }

    public void setNomeTripulacao(String nomeTripulacao) {
        this.nomeTripulacao = nomeTripulacao;
    }

    public String getRgTripulacao() {
        return rgTripulacao;
    }

    public void setRgTripulaco(String rgTripulacao) {
        this.rgTripulacao = rgTripulacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    } 
}
