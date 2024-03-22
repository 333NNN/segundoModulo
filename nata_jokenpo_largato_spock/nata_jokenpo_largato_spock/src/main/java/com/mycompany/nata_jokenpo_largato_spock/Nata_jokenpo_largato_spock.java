/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nata_jokenpo_largato_spock;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */

public class Nata_jokenpo_largato_spock {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao JoKenPo");
        System.out.println("------->REGRAS<--------");
        System.out.println("Escolha entre Pedra, Papel, Tesoura, Lagarto ou Spock.");
        System.out.println("Pedra vence tesoura e lagarto, mas perde para o papel e Spock.");
        System.out.println("Papel vence pedra e Spock, mas perde para tesoura e lagarto.");
        System.out.println("Tesoura vence papel e lagarto, mas perde para pedra e Spock.");
        System.out.println("Lagarto vence papel e Spock, mas perde para pedra e tesoura.");
        System.out.println("Spock vence pedra e tesoura, mas perde para papel e lagarto.");
        System.out.println("------->JOGO<--------");
        
        boolean jogarNovamente = true;
        while (jogarNovamente) {
            jogar();
            
            // Verificando se o jogador deseja jogar novamente
            System.out.println("Deseja jogar novamente? (S/N)");
            Scanner ler = new Scanner(System.in);
            String resposta = ler.nextLine();
            jogarNovamente = resposta.equalsIgnoreCase("s");
        }
        
        System.out.println("Obrigado por jogar! Até mais.");
    }
    
    public static void jogar() {
        // Definindo as opções do jogo
        String[] opcoes = {"Pedra", "Papel", "Tesoura", "Lagarto", "Spock"};
        
        
        String jogadorUm = obterEscolha(opcoes);
        
        String jogadorDois = obterEscolha(opcoes);
        
        // Exibindo escolhas
        System.out.println("Jogador Um escolheu: " + jogadorUm);
        System.out.println("Jogador Dois escolheu: " + jogadorDois);
        
        // Determinando o vencedor
        determinarVencedor(jogadorUm, jogadorDois);
    }
    
    // Função para obter a escolha do jogador
    public static String obterEscolha(String[] opcoes) {
        Scanner ler = new Scanner(System.in);
        String escolha = "";
        boolean escolhaValida = false;
        
        // Loop até que o jogador faça uma escolha válida
        while (!escolhaValida) {
            System.out.println("Escolha Pedra, Papel, Tesoura, Lagarto ou Spock:");
            escolha = ler.nextLine();
            
            // Verificando se a escolha é válida
            for (String opcao : opcoes) {
                if (opcao.equalsIgnoreCase(escolha)) {
                    escolhaValida = true;
                    break;
                }
            }
            
            if (!escolhaValida) {
                System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }
        
        return escolha;
    }
    
    // Função para determinar o vencedor
    public static void determinarVencedor(String jogadorUm, String jogadorDois) {
        
        if (jogadorUm.equalsIgnoreCase(jogadorDois)) {
            System.out.println("Empate!");
        } else if ((jogadorUm.equalsIgnoreCase("Pedra") && (jogadorDois.equalsIgnoreCase("Tesoura") || jogadorDois.equalsIgnoreCase("Lagarto"))) ||
                   (jogadorUm.equalsIgnoreCase("Papel") && (jogadorDois.equalsIgnoreCase("Pedra") || jogadorDois.equalsIgnoreCase("Spock"))) ||
                   (jogadorUm.equalsIgnoreCase("Tesoura") && (jogadorDois.equalsIgnoreCase("Papel") || jogadorDois.equalsIgnoreCase("Lagarto"))) ||
                   (jogadorUm.equalsIgnoreCase("Lagarto") && (jogadorDois.equalsIgnoreCase("Papel") || jogadorDois.equalsIgnoreCase("Spock"))) ||
                   (jogadorUm.equalsIgnoreCase("Spock") && (jogadorDois.equalsIgnoreCase("Pedra") || jogadorDois.equalsIgnoreCase("Tesoura")))) {
            System.out.println("Jogador vence!");
        } else {
            System.out.println("Computador vence!");
        }
    }
}
