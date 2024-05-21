package br.edu.up.model;

import java.time.LocalDate;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public SeguroVida(String apolice, Segurado segurado, double vlrApolice, LocalDate dtalnicio, LocalDate dtaFim, boolean cobreDoenca, boolean cobreAcidente) {
        super(apolice, segurado, vlrApolice, dtalnicio, dtaFim);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados() {
        return "SeguroVida{" +
                "apolice='" + getApolice() + '\'' +
                ", segurado=" + getSegurado() +
                ", vlrApolice=" + getVlrApolice() +
                ", dtalnicio=" + getDtalnicio() +
                ", dtaFim=" + getDtaFim() +
                ", cobreDoenca=" + cobreDoenca +
                ", cobreAcidente=" + cobreAcidente +
                '}';
    }
}

