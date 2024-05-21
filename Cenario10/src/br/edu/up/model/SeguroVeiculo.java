package br.edu.up.model;

import java.time.LocalDate;

public class SeguroVeiculo extends Seguro {
    private double virFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public SeguroVeiculo(String apolice, Segurado segurado, double vlrApolice, LocalDate dtalnicio, LocalDate dtaFim, double virFranquia, boolean temCarroReserva, boolean cobreVidros) {
        super(apolice, segurado, vlrApolice, dtalnicio, dtaFim);
        this.virFranquia = virFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }

    public double getVirFranquia() {
        return virFranquia;
    }

    public void setVirFranquia(double virFranquia) {
        this.virFranquia = virFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return "SeguroVeiculo{" +
                "apolice='" + getApolice() + '\'' +
                ", segurado=" + getSegurado() +
                ", vlrApolice=" + getVlrApolice() +
                ", dtalnicio=" + getDtalnicio() +
                ", dtaFim=" + getDtaFim() +
                ", virFranquia=" + virFranquia +
                ", temCarroReserva=" + temCarroReserva +
                ", cobreVidros=" + cobreVidros +
                '}';
    }
}
