/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String msg = ler.nextLine(); 
        int ctA = 0, ctE = 0, ctI = 0, ctO = 0, ctU = 0;
        for (int i = 0; i < msg.length(); i++) {
            switch (msg.charAt(i)) {
                case 'a':
                case 'A':
                    ctA += 1;
                    break;
                case 'e':
                case 'E':
                    ctE += 1;
                    break;
                case 'i':
                case 'I':
                    ctI += 1;
                    break;
                case 'o':
                case 'O':
                    ctO += 1;
                    break;
                case 'u':
                case 'U':
                    ctU += 1;
                    break;
            }
        }
        System.out.println("Contagem de 'A': " + ctA);
        System.out.println("Contagem de 'E': " + ctE);
        System.out.println("Contagem de 'I': " + ctI);
        System.out.println("Contagem de 'O': " + ctO);
        System.out.println("Contagem de 'U': " + ctU);
    }
}

