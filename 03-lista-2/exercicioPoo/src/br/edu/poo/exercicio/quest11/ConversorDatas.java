package br.edu.poo.exercicio.quest11;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConversorDatas {

    static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("EXEMPLO: DD/MM/AA");
        System.out.println("DIGITE UMA DATA: ");
        String data = sc.nextLine();

        try {
            if(data.length() > 10){
                throw new ParseException("Formato invalido!", 0);
            }

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate dataFormatada = LocalDate.parse(data, formato);

        } catch (Exception e){
            System.out.println("DIGITE A DATA NO FORTMATO CORRETO!");
        }


    }
}
