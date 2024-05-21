package br.edu.up.view;

import java.util.Scanner;
import br.edu.up.model.*;

public class SeguroView {
    private Scanner leitor = new Scanner(System.in);

    public int exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empresa");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public ClientePessoa incluirClientePessoa() {
        System.out.print("Nome: ");
        String nome = leitor.next();
        System.out.print("Telefone: ");
        String telefone = leitor.next();
        System.out.print("Email: ");
        String email = leitor.next();
        System.out.print("Rua: ");
        String rua = leitor.next();
        System.out.print("Número: ");
        String numero = leitor.next();
        System.out.print("Bairro: ");
        String bairro = leitor.next();
        System.out.print("CEP: ");
        String cep = leitor.next();
        System.out.print("Cidade: ");
        String cidadeNome = leitor.next();
        System.out.print("UF: ");
        String uf = leitor.next();
        System.out.print("CPF: ");
        String CPF = leitor.next();
        System.out.print("Peso: ");
        double peso = leitor.nextDouble();
        System.out.print("Altura: ");
        double altura = leitor.nextDouble();

        Cidade cidade = new Cidade(cidadeNome, uf);
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        return new ClientePessoa(nome, telefone, email, endereco, CPF, peso, altura);
    }

    public ClienteEmpresa incluirClienteEmpresa() {
        System.out.print("Nome: ");
        String nome = leitor.next();
        System.out.print("Telefone: ");
        String telefone = leitor.next();
        System.out.print("Email: ");
        String email = leitor.next();
        System.out.print("Rua: ");
        String rua = leitor.next();
        System.out.print("Número: ");
        String numero = leitor.next();
        System.out.print("Bairro: ");
        String bairro = leitor.next();
        System.out.print("CEP: ");
        String cep = leitor.next();
        System.out.print("Cidade: ");
        String cidadeNome = leitor.next();
        System.out.print("UF: ");
        String uf = leitor.next();
        System.out.print("CNPJ: ");
        String cnpj = leitor.next();
        System.out.print("Inscrição Estadual: ");
        String inscEstadual = leitor.next();
        System.out.print("Ano de Fundação: ");
        int anoFundacao = leitor.nextInt();

        Cidade cidade = new Cidade(cidadeNome, uf);
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        return new ClienteEmpresa(nome, telefone, email, endereco, cnpj, inscEstadual, anoFundacao);
    }

    public double solicitarValor(String acao) {
        System.out.print("Digite o valor para " + acao + ": ");
        return leitor.nextDouble();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarDados(String dados) {
        System.out.println(dados);
    }
}
