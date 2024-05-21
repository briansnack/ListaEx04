package br.edu.up.model;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, 25000.0);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    @Override
    public String getDados() {
        return "Nome: " + getNome() + "\n" +
               "Telefone: " + getTelefone() + "\n" +
               "Email: " + getEmail() + "\n" +
               "Endereço: " + getEndereco() + "\n" +
               "CNPJ: " + cnpj + "\n" +
               "Inscrição Estadual: " + inscEstadual + "\n" +
               "Ano de Fundação: " + anoFundacao + "\n" +
               "Crédito disponível: " + (getVlrMaxCredito() - getSaldo());
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" +
               "nome='" + getNome() + '\'' +
               ", cnpj='" + cnpj + '\'' +
               ", crédito='" + getSaldo() + '\'' +
               '}';
    }
}
