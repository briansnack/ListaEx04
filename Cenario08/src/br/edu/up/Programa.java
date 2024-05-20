package br.edu.up;

import br.edu.up.controller.*;
import br.edu.up.model.*;
import br.edu.up.view.*;

public class Programa {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        AgendaView view = new AgendaView();
        AgendaController controller = new AgendaController(agenda, view);
        controller.iniciar();
    }
}