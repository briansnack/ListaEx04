package br.edu.up.view;

import br.edu.up.model.*;

import java.time.LocalDate;
import java.util.Scanner;

public class SeguroView {
    private Scanner leitor = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public Seguro incluirSeguro() {
        System.out.print("Tipo de seguro (1- Vida, 2- Veículo): ");
        int tipo = leitor.nextInt();
        leitor.nextLine();  // Consumir a nova linha

        System.out.print("Número da apólice: ");
        String apolice = leitor.nextLine();

        System.out.print("Nome do segurado: ");
        String nome = leitor.nextLine();
        System.out.print("RG: ");
        String RG = leitor.nextLine();
        System.out.print("CPF: ");
        String CPF = leitor.nextLine();
        System.out.print("Sexo: ");
        String sexo = leitor.nextLine();
        System.out.print("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.print("Endereço: ");
        String endereco = leitor.nextLine();
        System.out.print("CEP: ");
        String CEP = leitor.nextLine();
        System.out.print("Cidade: ");
        String cidade = leitor.nextLine();

        Segurado segurado = new Segurado(nome, RG, CPF, sexo, telefone, endereco, CEP, cidade);

        System.out.print("Valor da apólice: ");
        double vlrApolice = leitor.nextDouble();
        System.out.print("Data de início (AAAA-MM-DD): ");
        LocalDate dtalnicio = LocalDate.parse(leitor.next());
        System.out.print("Data de fim (AAAA-MM-DD): ");
        LocalDate dtaFim = LocalDate.parse(leitor.next());

        if (tipo == 1) {
            System.out.print("Cobre doença (true/false): ");
            boolean cobreDoenca = leitor.nextBoolean();
            System.out.print("Cobre acidente (true/false): ");
            boolean cobreAcidente = leitor.nextBoolean();
            return new SeguroVida(apolice, segurado, vlrApolice, dtalnicio, dtaFim, cobreDoenca, cobreAcidente);
        } else if (tipo == 2) {
            System.out.print("Valor da franquia: ");
            double virFranquia = leitor.nextDouble();
            System.out.print("Tem carro reserva (true/false): ");
            boolean temCarroReserva = leitor.nextBoolean();
            System.out.print("Cobre vidros (true/false): ");
            boolean cobreVidros = leitor.nextBoolean();
            return new SeguroVeiculo(apolice, segurado, vlrApolice, dtalnicio, dtaFim, virFranquia, temCarroReserva, cobreVidros);
        }

        return null;
    }

    public String solicitarApolice() {
        System.out.print("Digite o número da apólice: ");
        return leitor.next();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarDados(String dados) {
        System.out.println(dados);
    }

    public boolean confirmarExclusaoTodos() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (sim/nao): ");
        String resposta = leitor.next();
        return resposta.equalsIgnoreCase("sim");
    }
}
