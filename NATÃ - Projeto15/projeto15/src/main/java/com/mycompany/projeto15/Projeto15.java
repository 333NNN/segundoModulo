package com.mycompany.projeto15;

import java.util.Scanner;

public class Projeto15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Informe a primeira nota: ");
            int primeiraNota = scanner.nextInt();
            System.out.println("Informe a segunda nota: ");
            int segundaNota = scanner.nextInt();
            int notaFinal = (primeiraNota + segundaNota) / 2;
            System.out.println("Sua média é: " + notaFinal);
            System.out.println("Deseja realizar um novo cálculo? (S/N)");
            scanner.nextLine();
            resposta = scanner.nextLine();
        }

        scanner.close();
    }
}
