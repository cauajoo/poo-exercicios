package br.edu.poo.exercicio.quest9;

public class VerificacaoNull {

    static void main(String[] args) {

        String nome = null;

        try{
            int quantidade = nome.length();

        } catch (Exception e){
            System.out.println("NOME NÃO PODE SER NULO!");
        }
    }
}
