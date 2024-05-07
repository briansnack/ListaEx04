package br.edu.up.model;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private int lotacaoMaxima;
    private int ingressosVendidos;
    private double precoIngresso;

    public Evento(String nome, String data, String local, int lotacaoMaxima, int ingressosVendidos,
            double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.ingressosVendidos = ingressosVendidos;
        this.precoIngresso = precoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    @Override
    public String toString(){
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", local='" + local + '\'' +
                ", lotacaoMaxima=" + lotacaoMaxima +
                ", ingressosVendidos=" + ingressosVendidos +
                ", precoIngresso=" + precoIngresso +
                '}';
    }
}
