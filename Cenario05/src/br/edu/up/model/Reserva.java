package br.edu.up.model;

public class Reserva {
    private String nomeResponsavel;
    private int quantidadePessoas;
    private double valorTotal;
    private String dataReserva;
    
    public Reserva(String nomeResponsavel, int quantidadePessoas, double valorTotal, String dataReserva) {
        this.nomeResponsavel = nomeResponsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.valorTotal = valorTotal;
        this.dataReserva = dataReserva;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nomeResponsavel='" + nomeResponsavel + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                ", valorTotal=" + valorTotal +
                ", dataReserva='" + dataReserva + '\'' +
                '}';
    }
}