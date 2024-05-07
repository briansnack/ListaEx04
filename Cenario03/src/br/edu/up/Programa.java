package br.edu.up;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Para quando deseja marcar o compromisso");

        System.out.println("Ano: ");
        int getAno = leitor.nextInt();

        System.out.println("Mês: ");
        int getMes = leitor.nextInt();

        System.out.println("Dia: ");
        int getDiaMes = leitor.nextInt();

        System.out.println("Hora: ");
        int getHora = leitor.nextInt();
        
        System.out.println("Local do compromisso: ");
        leitor.nextLine();
        String getLocal = leitor.nextLine(); 

        System.out.println("Assunto do compromisso: ");
        String getAssunto = leitor.nextLine();

        System.out.println("Pessoa do compromisso: ");
        String getPessoa = leitor.nextLine();
        
        Compromisso compromisso = new Compromisso(getPessoa, getLocal, getAssunto, getHora);

        Ano ano = new Ano(getAno, false);

        Mes mes = new Mes(getMes, 0);

        Dia dia = new Dia(getDiaMes, new Compromisso[24]);
        
        dia.adicionarCompromisso(compromisso);

        mostrarInformacoesCompromisso(compromisso, dia, mes, ano);

        leitor.close();
    }
    public static void mostrarInformacoesCompromisso(Compromisso comp, Dia dia, Mes mes, Ano ano) {
        System.out.println("\nCompromisso marcado para:");
        System.out.println("Data: " + dia.getDiaMes() + " de " + mes.getNomeMes() + " de " + ano.getAno());
        System.out.println("Hora: " + comp.getHora() + "h");
        System.out.println("Local: " + comp.getLocal());
        System.out.println("Assunto: " + comp.getAssunto());
        System.out.println("Pessoa: " + comp.getPessoa());
    }
}
