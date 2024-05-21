package br.edu.up;

import br.edu.up.controller.*;
import br.edu.up.view.*;

public class Programa {
    public static void main(String[] args) {
        SeguroView view = new SeguroView();
        SeguroController controller = new SeguroController(view);
        controller.iniciar();
    }
}