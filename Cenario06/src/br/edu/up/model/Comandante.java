package br.edu.up.model;

public class Comandante extends Tripulacao {
    private int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacao, int matricula, int totalHorasVoo) {
        super(nome, rg, identificacao, matricula);
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    } 
}
