package br.edu.up;

public class Ano {
    private int ano;
    private boolean bissexto;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }
    
    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }
    
    public boolean ehBissexto(int ano){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        } else{
            bissexto = false;
        }
        
        return bissexto;
    }

    
}
