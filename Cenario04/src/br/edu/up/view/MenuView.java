package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.model.Veiculo;

public class MenuView {
    private Scanner leitor;

    public MenuView(){
        leitor = new Scanner(System.in);
    }

    public int mostrarMenu(){
        System.out.println("==== Menu =====");
        System.out.println("1. Entrada de veículo");
        System.out.println("2. Saída de veículo");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção:");
        return leitor.nextInt();
    }

    public Veiculo solicitarDados(){
        leitor.nextLine();

        System.out.println("Modelo do veículo: ");
        String modelo = leitor.nextLine();

        System.out.println("Placa do veículo: ");
        String placa = leitor.nextLine();

        System.out.println("Cor do veículo: ");
        String cor = leitor.nextLine();

        return new Veiculo(modelo, placa, cor);
    }

    public String solicitarPlacaVeiculo() {
        leitor.nextLine();
        System.out.println("Digite a placa do veículo: ");
        return leitor.nextLine();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}


