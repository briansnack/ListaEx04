package br.edu.up.controller;

import br.edu.up.model.*;
import br.edu.up.view.UniversidadeView;

import java.util.ArrayList;
import java.util.List;

public class UniversidadeController {
    private UniversidadeView view;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public UniversidadeController(UniversidadeView view) {
        this.view = view;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    Aluno aluno = view.cadastrarAluno();
                    alunos.add(aluno);
                    break;
                case 2:
                    Professor professor = view.cadastrarProfessor();
                    professores.add(professor);
                    break;
                case 3:
                    Disciplina disciplina = view.cadastrarDisciplina(professores);
                    if (disciplina != null) {
                        disciplinas.add(disciplina);
                        adicionarCompetencias(disciplina);
                    }
                    break;
                case 4:
                    view.mensagem("Calculando situação dos alunos...");
                    for (Aluno a : alunos) {
                        calcularSituacaoAluno(a);
                    }
                    view.mensagem("Saindo do programa");
                    break;
                default:
                    view.mensagem("Opção inválida");
                    break;
            }
        } while (opcao != 4);
        view.encerrar();
    }

    public void adicionarAluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
        alunos.add(aluno);
    }

    public void adicionarProfessor(String nome, String rg, String matricula, String lattes, Titulacao titulacao) {
        Professor professor = new Professor(nome, rg, matricula, lattes, titulacao);
        professores.add(professor);
    }

    public void adicionarDisciplina(String nome, String identificador, String curriculo, Professor professor, List<Aluno> alunos, List<Competencia> competencias) {
        Disciplina disciplina = new Disciplina(nome, identificador, curriculo, professor, alunos, competencias);
        disciplinas.add(disciplina);
    }

    public void adicionarCompetencias(Disciplina disciplina) {
        view.mensagem("Adicionando competências à disciplina...");
        List<Competencia> competencias = view.adicionarCompetencias(disciplina.getNome());
        for (Competencia competencia : competencias) {
            disciplina.adicionarCompetencia(competencia.getNome(), competencia.isAtingida());
        }
    }

    public void calcularSituacaoAluno(Aluno aluno) {
        int totalCompetenciasNecessarias = 0;
        int competenciasNecessariasAtingidas = 0;
        int totalCompetenciasComplementares = 0;
        int competenciasComplementaresAtingidas = 0;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getAlunos().contains(aluno)) {
                for (Competencia competencia : disciplina.getCompetencias()) {
                    if (competencia.isAtingida()) {
                        if (disciplina.getCurriculo().equals("Necessário")) {
                            competenciasNecessariasAtingidas++;
                        } else {
                            competenciasComplementaresAtingidas++;
                        }
                    }

                    if (disciplina.getCurriculo().equals("Necessário")) {
                        totalCompetenciasNecessarias++;
                    } else {
                        totalCompetenciasComplementares++;
                    }
                }
            }
        }

        if (totalCompetenciasNecessarias == 0 || totalCompetenciasComplementares == 0) {
            view.mostrarSituacaoAluno(aluno, "Pendente");
        } else if (competenciasNecessariasAtingidas == totalCompetenciasNecessarias &&
                competenciasComplementaresAtingidas >= totalCompetenciasComplementares / 2) {
            view.mostrarSituacaoAluno(aluno, "Aprovado");
        } else {
            view.mostrarSituacaoAluno(aluno, "Reprovado");
        }
    }
}
