package br.edu.up;

import br.edu.up.controller.*;
import br.edu.up.view.*;

public class Programa {
    public static void main(String[] args) {
        ClienteView view = new ClienteView();
        ClienteController controller = new ClienteController(view);
        controller.iniciar();
    }
}
