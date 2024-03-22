/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto14;

import java.util.Scanner;
/**
 *
 * @author ncunha
 */
public class Projeto14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
            int primeiraNota = scanner.nextInt();
        System.out.println("Informe a segunda nota: ");
            int segundaNota = scanner.nextInt();
        int notaFinal = (primeiraNota + segundaNota)/2;
            System.out.println("Sua média é: "+ notaFinal);
    }
}
