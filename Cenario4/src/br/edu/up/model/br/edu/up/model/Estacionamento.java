package br.edu.up.model;

public class Estacionamento {
    private Veiculo[] vagas;
    private int totalVeiculos;
    
    public Estacionamento(int capacidade){
        this.vagas = new Veiculo[capacidade];
        this.totalVeiculos = 0;
    }
    
    public boolean entradaVeiculo(Veiculo veiculo){
        if (totalVeiculos < vagas.length) {
            vagas[totalVeiculos] = veiculo;
            totalVeiculos++;
            return true;
        }
        return false;
    }

    public Veiculo saidaVeiculo(String placa){
        for (int i = 0; i < totalVeiculos; i++) {
            if (vagas[i].getPlaca().equals(placa)) {
                Veiculo veiculo = vagas[i];
                for (int j = 0; j < totalVeiculos - 1; j++) {
                    vagas[j] = vagas[j + 1];
                }
                vagas[totalVeiculos - 1] = null;
                totalVeiculos--;
                return veiculo;
            }
        }
        return null;
    }

    public int getTotalVeiculos(){
        return totalVeiculos;
    }

}

