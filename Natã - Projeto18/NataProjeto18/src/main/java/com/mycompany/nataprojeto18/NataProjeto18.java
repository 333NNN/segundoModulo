/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nataprojeto18;

/**
 *
 * @author Nata e Julia
 */

import java.util.Scanner;

public class NataProjeto18 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int matriz[][] = new int[3][5];
        int v[] = new int[3 * 5];
        
        
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o valor do elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = ler.nextInt();
                v[index++] = matriz[i][j];
            }
        }
        
        
        for (int i = 0; i < 3 * 5 - 1; i++) {
            boolean troca = false;
            int j = 0;
            while (j < 3 * 5 - 1 - i) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    troca = true;
                }
                j++;
            }
            if (!troca) break;
        }
        
        
        index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = v[index++];
            }
        }
        
        
        System.out.println("Matriz ordenada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
