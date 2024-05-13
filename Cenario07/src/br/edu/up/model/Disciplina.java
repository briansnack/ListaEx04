package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Competencia> competencias;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor, List<Aluno> alunos, List<Competencia> competencias) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.alunos = alunos;
        this.competencias = competencias;
        if (this.alunos == null) {
            this.alunos = new ArrayList<>();
        }
        if (this.competencias == null) {
            this.competencias = new ArrayList<>();
        }
    }

    public void adicionarCompetencia(String nome, boolean atingida) {
        competencias.add(new Competencia(nome, atingida));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }
}
