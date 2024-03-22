/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nata.projeto10;

import java.util.Scanner;

public class NATAProjeto10 {

    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite seu nome:");
         String nome = ler.nextLine();
             
        System.out.println ("Digite seu peso em kg (exemplo: 80,5):");
         float peso = ler.nextFloat();
         
        System.out.println("Digite sua altura em m (exemplo: 1,75):");
         float altura = ler.nextFloat();
                 
        System.out.println();
        
        float imc = peso / (altura*altura);
        
        System.out.println(nome + ", seu IMC é: " + imc);
    }
}
