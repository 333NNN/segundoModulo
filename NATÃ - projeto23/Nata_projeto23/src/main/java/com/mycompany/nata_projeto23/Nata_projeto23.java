/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nata_projeto23;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author ncunha
 */
public class Nata_projeto23 {

    public static void main(String[] args) throws IOException {
        String s="";
        float[] notas = new float[4]; float media=0;
        DataInputStream dado;
        
        System.out.println("Entre com a nota 1: ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        notas[0] = Float.parseFloat(s);
        System.out.println("Entre com a nota 2: ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        notas[1] = Float.parseFloat(s);
        System.out.println("Entre com a nota 3: ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        notas[2] = Float.parseFloat(s);
        System.out.println("Entre com a nota 4: ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        notas[3] = Float.parseFloat(s);
        
        media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println("Sua média é: "+ media);
    }
}
