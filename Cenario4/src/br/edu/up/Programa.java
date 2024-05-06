package br.edu.up;

<<<<<<< HEAD
=======
import br.edu.up.model.Veiculo;
import br.edu.up.model.Estacionamento;
import br.edu.up.view.MenuView;
import br.edu.up.controller.EstacionamentoController;

>>>>>>> ac2692e02fc14d73cd4b3be470f7035bfae9dc43
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
<<<<<<< HEAD








=======
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
        
>>>>>>> ac2692e02fc14d73cd4b3be470f7035bfae9dc43
        leitor.close();
    }
}
