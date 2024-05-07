package br.edu.up.view;

import br.edu.up.controller.EventoController;
import br.edu.up.controller.ReservaController;
import br.edu.up.model.Evento;
import br.edu.up.model.Reserva;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static EventoController eventoController = new EventoController();
    private static ReservaController reservaController = new ReservaController();

    public static void iniciarPrograma() {
        int opcao;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1 - Incluir Evento");
            System.out.println("2 - Listar Eventos");
            System.out.println("3 - Alterar Evento");
            System.out.println("4 - Excluir Evento");
            System.out.println("5 - Realizar Reserva");
            System.out.println("6 - Listar Reservas");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    incluirEvento();
                    break;
                case 2:
                    listarEventos();
                    break;
                case 3:
                    alterarEvento();
                    break;
                case 4:
                    excluirEvento();
                    break;
                case 5:
                    realizarReserva();
                    break;
                case 6:
                    listarReservas();
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    private static void incluirEvento() {
        System.out.println("===== Incluir Evento =====");
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Data do evento: ");
        String data = scanner.nextLine();
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();
        System.out.print("Lotação máxima do evento: ");
        int lotacaoMaxima = scanner.nextInt();
        System.out.print("Quantidade de ingressos vendidos: ");
        int ingressosVendidos = scanner.nextInt();
        System.out.print("Preço do ingresso: ");
        double precoIngresso = scanner.nextDouble();

        eventoController.adicionarEvento(new Evento(nome, data, local, lotacaoMaxima, ingressosVendidos, precoIngresso));
        System.out.println("Evento adicionado com sucesso!");
    }

    private static void listarEventos() {
        System.out.println("===== Listar Eventos =====");
        for (Evento evento : eventoController.listarEventos()) {
            System.out.println(evento);
        }
    }

    private static void alterarEvento() {
        System.out.println("===== Alterar Evento =====");
        System.out.print("Digite o nome do evento que deseja alterar: ");
        String nome = scanner.nextLine();
        Evento evento = eventoController.buscarEvento(nome);
        if (evento != null) {
            System.out.print("Nova data do evento: ");
            String novaData = scanner.nextLine();
            System.out.print("Novo local do evento: ");
            String novoLocal = scanner.nextLine();
            System.out.print("Nova lotação máxima do evento: ");
            int novaLotacaoMaxima = scanner.nextInt();
            System.out.print("Nova quantidade de ingressos vendidos: ");
            int novosIngressosVendidos = scanner.nextInt();
            System.out.print("Novo preço do ingresso: ");
            double novoPrecoIngresso = scanner.nextDouble();

            evento.setData(novaData);
            evento.setLocal(novoLocal);
            evento.setLotacaoMaxima(novaLotacaoMaxima);
            evento.setIngressosVendidos(novosIngressosVendidos);
            evento.setPrecoIngresso(novoPrecoIngresso);

            System.out.println("Evento alterado com sucesso!");
        } else {
            System.out.println("Evento não encontrado!");
        }
    }

    private static void excluirEvento() {
        System.out.println("===== Excluir Evento =====");
        System.out.print("Digite o nome do evento que deseja excluir: ");
        String nome = scanner.nextLine();
        Evento evento = eventoController.buscarEvento(nome);
        if (evento != null) {
            eventoController.removerEvento(evento);
            System.out.println("Evento excluído com sucesso!");
        } else {
            System.out.println("Evento não encontrado!");
        }
    }

    private static void realizarReserva() {
        System.out.println("===== Realizar Reserva =====");
        System.out.print("Digite o nome do evento: ");
        String nomeEvento = scanner.nextLine();
        Evento evento = eventoController.buscarEvento(nomeEvento);
        if (evento != null) {
            System.out.print("Nome do responsável pela reserva: ");
            String nomeResponsavel = scanner.nextLine();
            System.out.print("Quantidade de pessoas: ");
            int quantidadePessoas = scanner.nextInt();
            double valorTotal = quantidadePessoas * evento.getPrecoIngresso();
            System.out.println("Valor total da reserva: R$" + valorTotal);
            System.out.print("Data da reserva: ");
            String dataReserva = scanner.next();

            Reserva reserva = new Reserva(nomeResponsavel, quantidadePessoas, valorTotal, dataReserva);
            reservaController.adicionarReserva(reserva);
            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Evento não encontrado!");
        }
    }

    private static void listarReservas() {
        System.out.println("===== Listar Reservas =====");
        for (Reserva reserva : reservaController.listarReservas()) {
            System.out.println(reserva);
        }
    }
}