package br.edu.up;

import br.edu.up.model.Veiculo;
import br.edu.up.model.Estacionamento;
import br.edu.up.view.MenuView;
import br.edu.up.controller.EstacionamentoController;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        MenuView menuView = new MenuView();
        Estacionamento estacionamento = new Estacionamento(10);
        EstacionamentoController controller = new EstacionamentoController(estacionamento, menuView);

        int opcao;
        do {
            opcao = menuView.mostrarMenu();
            switch (opcao) {
                case 1:
                    controller.entradaVeiculo();
                    break;
                case 2:
                    controller.saidaVeiculo();
                    break;
                case 3:
                    controller.emitirRelatorio();
                    break;
                case 4:
                    menuView.mostrarMensagem("Saindo do sistema");
                    break;
                default:
                    menuView.mostrarMensagem("Opção inválida!");
                    break;
            }
        } while(opcao != 4);
        
        leitor.close();
    }
}
