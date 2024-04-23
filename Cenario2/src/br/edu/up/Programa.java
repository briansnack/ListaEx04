package br.edu.up;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        DecimalFormat formatador = new DecimalFormat("0.00");

        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre o ponto 1 e ponto 2: " + formatador.format(distanciaPonto1Ponto2));

        double distanciaPonto2Coordenadas = ponto2.calcularDistancia(7, 2);
        System.out.println("Distância entre ponto 2 e coordenadas: " + formatador.format(distanciaPonto2Coordenadas));

        ponto1.setX(10);
        ponto1.setY(3);

        distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Nova distância entre o ponto 1 e ponto 2: " + formatador.format(distanciaPonto1Ponto2));

        leitor.close();

        ponto1.setX(10);
        ponto1.setY(3);
    }
}
