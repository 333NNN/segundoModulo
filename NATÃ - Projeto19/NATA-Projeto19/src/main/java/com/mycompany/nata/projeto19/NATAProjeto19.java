/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nata.projeto19;

/**
 *
 * @author ncunha
 */

import java.util.Scanner;
import java.util.Random;

public class NATAProjeto19 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = random.nextInt(600);
            }
        }

        int[] numerosUsuario = new int[10];
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numerosUsuario[i] = ler.nextInt();
        }

        System.out.println("Números encontrados na matriz:");
        for (int numero : numerosUsuario) {
            boolean encontrado = false;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (matriz[i][j] == numero) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    break;
                }
            }
            
            if (encontrado) {
                System.out.println(numero + " encontrado na matriz!");
            } else {
                System.out.println(numero + " não encontrado na matriz.");
            }
        }
        
    }
}
