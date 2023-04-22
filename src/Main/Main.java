package Main;

import Personagens.Heroi;
import Personagens.Inimigo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean menu = true;
        String nome = "Heroi"; //Definindo um nome padrão para garantir que a variável "nome" tenha um valor inicial
        String arma = "";
        int danoArma = 0;

        //While para o menu até uma escolha valida.
        while (menu == true){
            System.out.println("1 --> Para um novo Jogo\n2 --> Para sair");
            int escolha = scan.nextInt();
            //Verificando se a escolha é valida para iniciar o jogo
            if (escolha == 1 ){
                System.out.println("Qual o seu nome?");

                //Lendo a linha inteira do input
                scan.nextLine(); // Necessário para ler a linha inteira, após a leitura anterior de um inteiro
                nome = scan.nextLine(); // Lendo a próxima linha, que é a entrada do nome

                System.out.println("Muito bem "+nome+".\nAgora escolha uma arma para levar em sua jornada:\n" +
                        "1 -> Machado (+50 de ataque)\n2 -> Espada longa (+35 de Ataque)\n" +
                        "3 -> Espadas duplas (+20 chance de dois ataques seguidos)");

                //while para escolha da arma até gerar uma escolha valida.
                boolean whileescolhaArma = true;
                while (whileescolhaArma == true){
                    //Verificando se o próximo token do input é um inteiro
                    if (scan.hasNextInt()) { // Verificando se o próximo token é um inteiro
                        int escolhaArma = scan.nextInt();
                        //Switch com as 3 escolhas de armas
                        switch (escolhaArma){
                            case 1:
                                arma = "Machado";
                                danoArma = 50;
                                whileescolhaArma = false;
                                break;
                            case 2:
                                arma = "Espada Longa";
                                danoArma = 35;
                                whileescolhaArma = false;
                                break;
                            case 3:
                                arma = "Espadas duplas";
                                danoArma = 20;
                                whileescolhaArma = false;
                                break;
                            default:
                                System.out.println("Escolha inválida. Tente novamente.");
                                break;
                        }
                    } else {
                        //Lendo o token inválido para limpar o input
                        String invalidToken = scan.next(); // Lendo o token inválido
                        System.out.println("Escolha inválida. Tente novamente.");
                    }
                }
                menu = false; // Saindo do menu quando as escolhas de nome e arma forem válidas
            }
            else if (escolha == 2){
                System.exit(0); // Encerrando o programa se a escolha for "2"
            }
        }

        // Criando um objeto do tipo "Heroi" com as informações coletadas do jogador
        var heroi = new Heroi(nome, 200, true, 30, arma, danoArma);
        heroi.ExibirPersonagem(); // Chamando o método "ExibirPersonagem" do objeto "heroi" para mostrar as informações na tela

        var inimigo = new Inimigo("Marcos",250,true,50,"Besta",50);
    }
}