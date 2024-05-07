package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Evento;

public class EventoController {
    
    private List<Evento> eventos = new ArrayList<>();
    
    public void adicionarEvento(Evento evento){
        eventos.add(evento);
    }

    public List<Evento> listarEventos(){
        return eventos;
    }

    public Evento buscarEvento(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equalsIgnoreCase(nome)) {
                return evento;
            }
        }
        return null;
    }

    public void removerEvento(Evento evento){
        eventos.remove(evento);
    }
}
