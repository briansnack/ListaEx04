package br.edu.up.controller;

import br.edu.up.model.*;
import br.edu.up.view.AeroportoView;

import java.util.ArrayList;
import java.util.List;

public class AeroportoController {
    private List<Passageiro> passageiros;
    private List<Tripulacao> tripulacao;
    private List<Aviao> avioes;
    private AeroportoView view;

    public AeroportoController() {
        passageiros = new ArrayList<>();
        tripulacao = new ArrayList<>();
        avioes = new ArrayList<>();
        view = new AeroportoView();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    cadastrarPassageiro();
                    break;
                case 2:
                    cadastrarTripulacao();
                    break;
                case 3:
                    cadastrarAviao();
                    break;
                case 4:
                    view.mensagem("Saindo do programa");
                    break;
                default:
                    view.mensagem("Opção inválida");
                    break;
            }
        } while (opcao != 4);
        view.encerrar();
    }
    

    private void cadastrarPassageiro() {
        Passageiro passageiro = view.cadastrarPassageiro(avioes);
        if (passageiro != null) {
            passageiros.add(passageiro);
            view.mensagem("Passageiro cadastrado");
        }
    }

    private void cadastrarTripulacao() {
        Tripulacao novaTripulacao = view.cadastrarTripulacao(tripulacao, avioes);
        if (novaTripulacao != null) {
            tripulacao.add(novaTripulacao);
            view.mensagem(novaTripulacao.getClass().getSimpleName() + " cadastrado");
        }
    }

    private void cadastrarAviao() {
        Aviao novoAviao = view.cadastrarAviao();
        if (novoAviao != null) {
            avioes.add(novoAviao);
            view.mensagem("Avião cadastrado");
        }
    }
}
