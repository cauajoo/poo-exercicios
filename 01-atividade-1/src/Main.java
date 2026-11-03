import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Informe o Nome do Aluno: ");
        String nome =  sc.nextLine();

        System.out.println("Informe a turma do Aluno[: ");
        int turma =  sc.nextInt();

        System.out.println("Informe a Matricula do Aluno: ");
        int matricula =  sc.nextInt();

        Aluno aluno = new Aluno(nome, matricula, turma);

        double notaOne;
        double notaTwo;

        do {
            System.out.println("Informe a primeira nota de 0 à 10: ");

            notaOne = sc.nextDouble();

        } while (notaOne < 0 || notaOne > 10);

        do {
            System.out.println("Informe a segunda nota de 0 à 10: ");

            notaTwo = sc.nextDouble();

        } while (notaTwo < 0 || notaTwo > 10);

        Boletim boletim = new Boletim(aluno, notaOne, notaTwo);

        System.out.println();
        System.out.println(boletim);
    }

}