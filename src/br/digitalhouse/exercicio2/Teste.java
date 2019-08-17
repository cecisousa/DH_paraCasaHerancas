package br.digitalhouse.exercicio2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        System.out.println("Qual ingresso você deseja comprar? Digite 1 para ingresso Normal ou 2 para ingresso VIP.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number == 1){
            System.out.println("Você escolheu um ingresso Normal.");
            Normal ingresso = new Normal();
            ingresso.imprimeValor();
        } else if(number == 2){
            System.out.println("Você escolheu um ingresso VIP.");
            System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior.");
            number = input.nextInt();
            if(number == 1){
                System.out.println("Você escolheu um ingresso Camarote Superior.");
                CamaroteSuperior ingresso = new CamaroteSuperior();
                ingresso.imprimeValor();
            } else if (number == 2){
                System.out.println("Você escolheu um ingresso Camarote Inferior.");
                CamaroteInferior ingresso = new CamaroteInferior(1);
                ingresso.imprimeValor();
            } else {
                System.out.println("Número inválido.");
            }
        } else {
            System.out.println("Número inválido.");
        }
    }
}
