package br.edu.up;

import br.edu.up.controller.UniversidadeController;
import br.edu.up.view.UniversidadeView;

public class Programa {
    public static void main(String[] args) {
        UniversidadeController controller = new UniversidadeController(new UniversidadeView());
        controller.iniciar();
    }
}
