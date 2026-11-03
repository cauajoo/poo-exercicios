package br.edu.poo.exercicio.quest10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConversorData {

    static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("EXEMPLO: DD/MM/AA");
        System.out.println("DIGITE UMA DATA: ");
        String data = sc.nextLine();

        try {
            if(data.length() > 10){
                throw new ParseException("Formato invalido!", 0);
            }

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Date dataFormatada = formato.parse(data);

        } catch (Exception e){
            System.out.println("DIGITE A DATA NO FORTMATO CORRETO!");
        }


    }
}
