package br.edu.up.controller;

import br.edu.up.model.*;
import br.edu.up.view.*;

import java.util.ArrayList;
import java.util.List;

public class SeguroController {
    private List<Seguro> seguros = new ArrayList<>();
    private SeguroView view;

    public SeguroController(SeguroView view) {
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    view.mostrarMensagem("Saindo");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida.");
            }
        } while (opcao != 7);
    }

    private void incluirSeguro() {
        Seguro seguro = view.incluirSeguro();
        if (seguro != null && !apoliceExistente(seguro.getApolice())) {
            seguros.add(seguro);
            view.mostrarMensagem("Seguro incluído.");
        } else {
            view.mostrarMensagem("Apólice já existente ou seguro inválido.");
        }
    }

    private void localizarSeguro() {
        String apolice = view.solicitarApolice();
        Seguro seguro = buscarSeguro(apolice);
        if (seguro != null) {
            view.mostrarDados(seguro.getDados());
        } else {
            view.mostrarMensagem("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        String apolice = view.solicitarApolice();
        Seguro seguro = buscarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            view.mostrarMensagem("Seguro excluído.");
        } else {
            view.mostrarMensagem("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        if (view.confirmarExclusaoTodos()) {
            seguros.clear();
            view.mostrarMensagem("Todos os seguros foram excluídos.");
        } else {
            view.mostrarMensagem("Exclusão de todos os seguros cancelada.");
        }
    }

    private void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            view.mostrarMensagem("Nenhum seguro cadastrado.");
        } else {
            for (Seguro seguro : seguros) {
                view.mostrarDados(seguro.getDados());
            }
        }
    }

    private void verQuantidadeSeguros() {
        view.mostrarMensagem("Quantidade de seguros: " + seguros.size());
    }

    private boolean apoliceExistente(String apolice) {
        return seguros.stream().anyMatch(seguro -> seguro.getApolice().equals(apolice));
    }

    private Seguro buscarSeguro(String apolice) {
        return seguros.stream().filter(seguro -> seguro.getApolice().equals(apolice)).findFirst().orElse(null);
    }
}
