package br.edu.up.model;

public class Passageiro {
    private String nomePassageiro;
    private String rgPassageiro;
    private int identificadorBagagem;
    private Passagem passagem;
    private Aviao aviao;
    
    public Passageiro(String nomePassageiro, String rgPassageiro, int identificadorBagagem, Passagem passagem, Aviao aviao) {
        this.nomePassageiro = nomePassageiro;
        this.rgPassageiro = rgPassageiro;
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
        this.aviao = aviao;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getRgPassageiro() {
        return rgPassageiro;
    }

    public void setRgPassageiro(String rgPassageiro) {
        this.rgPassageiro = rgPassageiro;
    }

    public int getIdentificadorBagagem() {
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(int identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }
}
