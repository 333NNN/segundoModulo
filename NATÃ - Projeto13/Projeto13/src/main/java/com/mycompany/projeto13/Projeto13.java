/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto13;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class Projeto13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        int primeiroValor = scanner.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        int segundoValor =  scanner.nextInt();
        
        while (segundoValor == 0){
            System.out.println("O segundo valor não pode ser Zero (0). Informe um novo valor: ");
            System.out.println("Novo valor para segundo número: ");
                segundoValor =  scanner.nextInt();
        }
        int resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);
        scanner.close();
    }
}
