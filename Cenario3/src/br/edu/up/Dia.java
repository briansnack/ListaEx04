package br.edu.up;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;
    
    public Dia(int diaMes, Compromisso[] compromissos) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void adicionarCompromisso(Compromisso comp){
        if (comp.getHora() >= 0 && comp.getHora() <= 24){
            compromissos[comp.getHora()] = comp;
        } else {
            System.out.println("Hora inválida");
        }
    }

    public Compromisso consultarCompromisso(int hora){
        if (hora >= 0 && hora <= 24){
            return compromissos[hora];
        } else {
            System.out.println("Hora inválida");
            return null;
        }
    }

    public String listarCompromisso(){
        String lista = "";
        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] != null) {
                lista += "Hora: " + i + " - " + compromissos[i] + "\n";
            }
        }
        return lista;
    }

}
