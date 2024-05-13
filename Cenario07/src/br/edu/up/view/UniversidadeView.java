package br.edu.up.view;

import br.edu.up.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversidadeView {
    private Scanner leitor;

    public UniversidadeView() {
        leitor = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastar aluno");
        System.out.println("2. Cadastrar professor");
        System.out.println("3. Cadastrar disciplina");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public Aluno cadastrarAluno() {
        System.out.println("\nCadastro do aluno: ");
        leitor.nextLine();

        System.out.println("Nome: ");
        String nome = leitor.nextLine();

        System.out.println("RG: ");
        String rg = leitor.nextLine();

        System.out.println("Matrícula: ");
        String matricula = leitor.nextLine();

        System.out.println("Ano de ingresso: ");
        int anoIngresso = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Curso: ");
        String curso = leitor.nextLine();

        System.out.println("Turno: ");
        String turno = leitor.nextLine();

        return new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
    }

    public Professor cadastrarProfessor() {
        System.out.println("\nCadastro do professor: ");
        leitor.nextLine();

        System.out.println("Nome: ");
        String nome = leitor.nextLine();

        System.out.println("RG: ");
        String rg = leitor.nextLine();

        System.out.println("Matrícula: ");
        String matricula = leitor.nextLine();

        System.out.println("Lattes: ");
        String lattes = leitor.nextLine();

        System.out.println("Titulação: ");
        String titulacaoNome = leitor.nextLine();

        Titulacao titulacao = new Titulacao(titulacaoNome);

        return new Professor(nome, rg, matricula, lattes, titulacao);
    }

    public Disciplina cadastrarDisciplina(List<Professor> professores) {
        System.out.println("\nCadastro de disciplina: ");
        leitor.nextLine();

        System.out.println("Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Identificador: ");
        String identificador = leitor.nextLine();

        System.out.println("Currículo (Necessário ou Complementar): ");
        String curriculo = leitor.nextLine();

        System.out.println("Professor (Matrícula): ");
        String matriculaProfessor = leitor.nextLine();

        Professor professor = encontrarProfessor(professores, matriculaProfessor);
        if (professor != null) {
            return new Disciplina(nome, identificador, curriculo, professor, null, null);
        } else {
            System.out.println("Professor não encontrado");
            return null;
        }
    }

    public List<Competencia> adicionarCompetencias(String disciplinaNome) {
        List<Competencia> competencias = new ArrayList<>();
        System.out.println("\nAdicionar competências à disciplina " + disciplinaNome);
        char opcao;
        do {
            System.out.println("Nome da competência: ");
            String nome = leitor.nextLine();
            System.out.println("Competência atingida (S/N): ");
            boolean atingida = leitor.nextLine().equalsIgnoreCase("S");
            competencias.add(new Competencia(nome, atingida));
            System.out.println("Adicionar outra competência (S/N)? ");
            opcao = leitor.nextLine().toUpperCase().charAt(0);
        } while (opcao == 'S');
        return competencias;
    }

    private Professor encontrarProfessor(List<Professor> professores, String matriculaProfessor) {
        for (Professor professor : professores) {
            if (professor.getMatricula().equals(matriculaProfessor)) {
                return professor;
            }
        }
        return null;
    }

    public void mostrarSituacaoAluno(Aluno aluno, String situacao) {
        System.out.println("Situação do aluno " + aluno.getNome() + ": " + situacao);
    }

    public void mensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void encerrar() {
        leitor.close();
    }
}
