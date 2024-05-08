package br.edu.up.model;

import java.util.List;

public class Comissario extends Tripulacao{
    private List<String> idiomasFluentes;

    public Comissario(String nome, String rg, String identificacao, int matricula, List<String> idiomasFluentes) {
        super(nome, rg, identificacao, matricula);
        this.idiomasFluentes = idiomasFluentes;
    }

    public List<String> getIdiomasFluentes() {
        return idiomasFluentes;
    }

    public void setIdiomasFluentes(List<String> idiomasFluentes) {
        this.idiomasFluentes = idiomasFluentes;
    } 
}
