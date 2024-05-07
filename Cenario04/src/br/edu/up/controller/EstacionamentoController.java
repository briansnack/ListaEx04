package br.edu.up.controller;

import br.edu.up.model.Estacionamento;
import br.edu.up.model.Veiculo;
import br.edu.up.view.MenuView;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private MenuView menuView;

    public EstacionamentoController(Estacionamento estacionamento, MenuView menuView) {
        this.estacionamento = estacionamento;
        this.menuView = menuView;
    }

    public void entradaVeiculo() {
        Veiculo veiculo = menuView.solicitarDados();
        if (estacionamento.entradaVeiculo(veiculo)) {
            menuView.mostrarMensagem("Veículo estacionado");
        } else {
            menuView.mostrarMensagem("Estacionamento lotado");
        }
    }

    public void saidaVeiculo() {
        String placa = menuView.solicitarPlacaVeiculo();
        Veiculo veiculoSaida = estacionamento.saidaVeiculo(placa);
        if (veiculoSaida != null) {
            menuView.mostrarMensagem("Veículo com placa " + placa + " saiu do estacionamento.");
        } else {
            menuView.mostrarMensagem("Veículo com placa " + placa + " não encontrado.");
        }
    }

    public void emitirRelatorio() {
        int totalVeiculos = estacionamento.getTotalVeiculos();
        int valorTotal = totalVeiculos * 5;
        menuView.mostrarMensagem("Relatório: Total de veículos estacionados: " + totalVeiculos + "\nValor total: R$" + valorTotal);
    }
}

