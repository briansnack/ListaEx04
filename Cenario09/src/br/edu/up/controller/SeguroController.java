package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.model.*;
import br.edu.up.view.*;

public class SeguroController {
    private List<ClientePessoa> clientesPessoas = new ArrayList<>();
    private List<ClienteEmpresa> clientesEmpresas = new ArrayList<>();
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
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    emprestarParaClienteEmpresa();
                    break;
                case 7:
                    devolucaoClientePessoa();
                    break;
                case 8:
                    devolucaoClienteEmpresa();
                    break;
                case 9:
                    view.mostrarMensagem("Saindo");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida.");
            }
        } while (opcao != 9);
    }

    private void incluirClientePessoa() {
        ClientePessoa cliente = view.incluirClientePessoa();
        clientesPessoas.add(cliente);
        view.mostrarMensagem("Cliente pessoa incluído.");
    }

    private void incluirClienteEmpresa() {
        ClienteEmpresa cliente = view.incluirClienteEmpresa();
        clientesEmpresas.add(cliente);
        view.mostrarMensagem("Cliente empresa incluído.");
    }

    private void mostrarDadosClientePessoa() {
        if (clientesPessoas.isEmpty()) {
            view.mostrarMensagem("Nenhum cliente pessoa cadastrado.");
        } else {
            for (ClientePessoa cliente : clientesPessoas) {
                view.mostrarDados(cliente.getDados());
            }
        }
    }

    private void mostrarDadosClienteEmpresa() {
        if (clientesEmpresas.isEmpty()) {
            view.mostrarMensagem("Nenhum cliente empresa cadastrado.");
        } else {
            for (ClienteEmpresa cliente : clientesEmpresas) {
                view.mostrarDados(cliente.getDados());
            }
        }
    }

    private void emprestarParaClientePessoa() {
        if (clientesPessoas.isEmpty()) {
            view.mostrarMensagem("Nenhum cliente pessoa cadastrado.");
        } else {
            double valor = view.solicitarValor("empréstimo");
            ClientePessoa cliente = clientesPessoas.get(0);
            try {
                cliente.emprestar(valor);
                view.mostrarMensagem("Valor emprestado com sucesso.");
            } catch (IllegalArgumentException e) {
                view.mostrarMensagem(e.getMessage());
            }
        }
    }

    private void emprestarParaClienteEmpresa() {
        if (clientesEmpresas.isEmpty()) {
            view.mostrarMensagem("Nenhum cliente empresa cadastrado.");
        } else {
            double valor = view.solicitarValor("empréstimo");
            ClienteEmpresa cliente = clientesEmpresas.get(0);
            try {
                cliente.emprestar(valor);
                view.mostrarMensagem("Valor emprestado com sucesso.");
            } catch (IllegalArgumentException e) {
                view.mostrarMensagem(e.getMessage());
            }
        }
    }

    private void devolucaoClientePessoa() {
        if (clientesPessoas.isEmpty()) {
            view.mostrarMensagem("Nenhum cliente pessoa cadastrado.");
        } else {
            double valor = view.solicitarValor("devolução");
            ClientePessoa cliente = clientesPessoas.get(0);
            try {
                cliente.devolver(valor);
                view.mostrarMensagem("Valor devolvido com sucesso.");
            } catch (IllegalArgumentException e) {
                view.mostrarMensagem(e.getMessage());
            }
        }
    }

    private void devolucaoClienteEmpresa() {
        if (clientesEmpresas.isEmpty()) {
            view.mostrarMensagem("Nenhum cliente empresa cadastrado.");
        } else {
            double valor = view.solicitarValor("devolução");
            ClienteEmpresa cliente = clientesEmpresas.get(0);
            try {
                cliente.devolver(valor);
                view.mostrarMensagem("Valor devolvido com sucesso.");
            } catch (IllegalArgumentException e) {
                view.mostrarMensagem(e.getMessage());
            }
        }
    }
}