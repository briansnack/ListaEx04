package br.edu.up.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Passagem {
    private int numAssento;
    private String classeAssento;
    private LocalDateTime dataVoo;
    
    public static final DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
    public Passagem(int numAssento, String classeAssento, LocalDateTime dataVoo) {
        this.numAssento = numAssento;
        this.classeAssento = classeAssento;
        this.dataVoo = dataVoo;
    }

    public int getNumAssento() {
        return numAssento;
    }

    public void setNumAssento(int numAssento) {
        this.numAssento = numAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }   
}
