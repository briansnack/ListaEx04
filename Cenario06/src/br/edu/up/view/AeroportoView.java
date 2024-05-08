package br.edu.up.view;

import br.edu.up.model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AeroportoView {
    private Scanner leitor;

    public AeroportoView() {
        leitor = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastar passageiro");
        System.out.println("2. Cadastrar tripulação");
        System.out.println("3. Cadastrar avião");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public Passageiro cadastrarPassageiro(List<Aviao> avioes) {
        System.out.println("\nCadastro do passageiro: ");
        leitor.nextLine();

        System.out.println("Nome: ");
        String nomePassageiro = leitor.nextLine();

        System.out.println("RG: ");
        String rgPassageiro = leitor.nextLine();

        System.out.println("Identificador de bagagem: ");
        int identificadorBagagem = leitor.nextInt();

        System.out.println("Número do assento: ");
        int numAssento = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Classe do assento: ");
        String classeAssento = leitor.nextLine();

        System.out.println("Código do avião: ");
        int codigoAviao = leitor.nextInt();
        leitor.nextLine();

        Aviao aviao = encontrarAviao(avioes, codigoAviao);
        if (aviao != null) {
            LocalDateTime dataVoo = LocalDateTime.now();
            return new Passageiro(nomePassageiro, rgPassageiro, identificadorBagagem,
                    new Passagem(numAssento, classeAssento, dataVoo), aviao);
        } else {
            System.out.println("Avião não encontrado");
            return null;
        }
    }

    private Aviao encontrarAviao(List<Aviao> avioes, int codigoAviao) {
        for (Aviao aviao : avioes) {
            if (aviao.getCodigo() == codigoAviao) {
                return aviao;
            }
        }
        return null;
    }

    public Tripulacao cadastrarTripulacao(List<Tripulacao> tripulacao, List<Aviao> avioes) {
        System.out.println("\nCadastro de Tripulação: ");

        leitor.nextLine();
        System.out.println("Nome: ");
        String nomeTripulacao = leitor.nextLine();

        System.out.println("RG: ");
        String rgTripulacao = leitor.nextLine();

        System.out.println("Identificação aeronáutica: ");
        String identificacao = leitor.nextLine();

        System.out.println("Matrícula: ");
        int matricula = leitor.nextInt();
        leitor.nextLine();

        System.out.println("1. Comandante");
        System.out.println("2. Comissário");
        System.out.println("Escolha uma opção: ");
        int opcao = leitor.nextInt();
        leitor.nextLine();

        if (opcao == 1) {
            System.out.println("Total de horas de voo: ");
            int totalHorasVoo = leitor.nextInt();
            leitor.nextLine();

            return new Comandante(nomeTripulacao, rgTripulacao, identificacao, matricula, totalHorasVoo);
        } else if (opcao == 2) {
            System.out.println("Quantidade de idiomas falados: ");
            int qtdIdiomas = leitor.nextInt();
            leitor.nextLine();

            List<String> idiomas = new ArrayList<>();
            for (int i = 0; i < qtdIdiomas; i++) {
                System.out.println("Idioma " + (i + 1) + ": ");
                idiomas.add(leitor.nextLine());
            }

            return new Comissario(nomeTripulacao, rgTripulacao, identificacao, matricula, idiomas);

        } else {
            System.out.println("Opção inválida");
            return null;
        }
    }

    public Aviao cadastrarAviao() {
        System.out.println("\nCadastro de Avião: ");

        System.out.println("Código: ");
        int codigo = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Tipo: ");
        String tipo = leitor.nextLine();

        System.out.println("Quantidade de assentos: ");
        int quantidadeAssentos = leitor.nextInt();
        leitor.nextLine();

        return new Aviao(codigo, tipo, quantidadeAssentos);
    }

    public void mensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void encerrar() {
        leitor.close();
    }
}
