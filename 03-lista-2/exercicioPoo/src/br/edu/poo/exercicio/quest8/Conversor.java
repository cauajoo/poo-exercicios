package br.edu.poo.exercicio.quest8;

import java.util.Scanner;

public class Conversor {

    static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("DIGITE O NOMERO A CONVERTER: ");
        String num = sc.nextLine();

        try{

            int numero = Integer.parseInt(num);

        } catch (Exception e){
            System.out.println("DIGITE APENAS NUMEROS!");
        }

    }
}
