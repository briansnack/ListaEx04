package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.model.Reserva;

public class ReservaController {
    private List<Reserva> reservas = new ArrayList<>();

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
}