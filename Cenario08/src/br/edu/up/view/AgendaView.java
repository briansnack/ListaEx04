package br.edu.up.view;

import br.edu.up.model.Comercial;
import br.edu.up.model.Contato;
import br.edu.up.model.Pessoal;

import java.util.Scanner;

public class AgendaView {
    private Scanner leitor;

    public AgendaView() {
        this.leitor = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public Pessoal lerContatoPessoal() {
        System.out.print("Código: ");
        int codigo = leitor.nextInt();
        leitor.nextLine(); 
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.print("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = leitor.nextLine();
        return new Pessoal(codigo, nome, telefone, aniversario);
    }

    public Comercial lerContatoComercial() {
        System.out.print("Código: ");
        int codigo = leitor.nextInt();
        leitor.nextLine(); 
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.print("Telefone: ");
        String telefone = leitor.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = leitor.nextLine();
        return new Comercial(codigo, nome, telefone, cnpj);
    }

    public int lerCodigo() {
        System.out.print("Digite o código: ");
        return leitor.nextInt();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarContato(Contato contato) {
        if (contato != null) {
            System.out.println(contato.toString());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}