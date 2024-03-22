/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto16;

/**
 *
 * @author ncunha
 */
import java.util.Scanner;

public class Projeto16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Informe a idade do primeiro homem: ");
        int idadeHomem1 = scanner.nextInt();
        System.out.println("Informe a idade do segundo homem: ");
        int idadeHomem2 = scanner.nextInt();

        System.out.println("Informe a idade da primeira mulher: ");
        int idadeMulher1 = scanner.nextInt();
        System.out.println("Informe a idade da segunda mulher: ");
        int idadeMulher2 = scanner.nextInt();

        int somaIdades = 0;
        if (idadeHomem1 > idadeHomem2) {
            if (idadeMulher1 < idadeMulher2) {
                somaIdades = idadeHomem1 + idadeMulher1;
            } else {
                somaIdades = idadeHomem1 + idadeMulher2;
            }
        } else {
            if (idadeMulher1 < idadeMulher2) {
                somaIdades = idadeHomem2 + idadeMulher1;
            } else {
                somaIdades = idadeHomem2 + idadeMulher2;
            }
        }
        int produtoIdades = 0;
        if (idadeHomem1 < idadeHomem2) {
            if (idadeMulher1 > idadeMulher2) {
                produtoIdades = idadeHomem1 * idadeMulher1;
            } else {
                produtoIdades = idadeHomem1 * idadeMulher2;
            }
        } else {
            if (idadeMulher1 > idadeMulher2) {
                produtoIdades = idadeHomem2 * idadeMulher1;
            } else {
                produtoIdades = idadeHomem2 * idadeMulher2;
            }
        }

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);

        scanner.close();
    }
}

