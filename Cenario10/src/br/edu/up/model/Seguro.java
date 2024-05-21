package br.edu.up.model;

import java.time.LocalDate;

public abstract class Seguro {
    private String apolice;
    private Segurado segurado;
    private double vlrApolice;
    private LocalDate dtalnicio;
    private LocalDate dtaFim;

    public Seguro(String apolice, Segurado segurado, double vlrApolice, LocalDate dtalnicio, LocalDate dtaFim) {
        this.apolice = apolice;
        this.segurado = segurado;
        this.vlrApolice = vlrApolice;
        this.dtalnicio = dtalnicio;
        this.dtaFim = dtaFim;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public double getVlrApolice() {
        return vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public LocalDate getDtalnicio() {
        return dtalnicio;
    }

    public void setDtalnicio(LocalDate dtalnicio) {
        this.dtalnicio = dtalnicio;
    }

    public LocalDate getDtaFim() {
        return dtaFim;
    }

    public void setDtaFim(LocalDate dtaFim) {
        this.dtaFim = dtaFim;
    }

    public abstract String getDados();
}

