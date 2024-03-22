/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nata.projeto17;


import java.util.Scanner;

public class NataProjeto17 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n = 10;
        int v[] = new int[n];
               
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor do " + (i + 1) + "º elemento: ");
            v[i] = ler.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean troca = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    troca = true;
                }
            }
            if (!troca) break;
        }
        
        System.out.println("Vetor ordenado:");
        for (int num : v) {
            System.out.print(num + " ");
        }
        
    }
}