package br.edu.up.controller;

import br.edu.up.view.AgendaView;

import br.edu.up.model.*;

public class AgendaController {
    private Agenda agenda;
    private AgendaView view;

    public AgendaController(Agenda agenda, AgendaView view) {
        this.agenda = agenda;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    Pessoal pessoal = view.lerContatoPessoal();
                    agenda.adicionar(pessoal);
                    view.mostrarMensagem("Contato pessoal adicionado!");
                    break;
                case 2:
                    Comercial comercial = view.lerContatoComercial();
                    agenda.adicionar(comercial);
                    view.mostrarMensagem("Contato comercial adicionado!");
                    break;
                case 3:
                    int codigoExcluir = view.lerCodigo();
                    agenda.excluirContato(codigoExcluir);
                    view.mostrarMensagem("Contato excluído!");
                    break;
                case 4:
                    int codigoConsultar = view.lerCodigo();
                    Contato contato = agenda.getContato(codigoConsultar);
                    view.mostrarContato(contato);
                    break;
                case 5:
                    view.mostrarMensagem(agenda.listarContatos());
                    break;
                case 6:
                    view.mostrarMensagem("Saindo do programa");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }
}