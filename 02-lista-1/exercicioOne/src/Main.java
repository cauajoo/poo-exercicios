public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Caua", 123456);
        Boletim boletim1 = new Boletim(aluno1, 7.5, 10);

        Aluno aluno2 = new Aluno("José", 987789);
        Boletim boletim2 = new Boletim(aluno2, 5, 6);

        Aluno aluno3 = new Aluno("Maria", 654321);
        Boletim boletim3 = new Boletim(aluno3, 30, 10);

        mostrarResultado(boletim1);
        mostrarResultado(boletim2);
        mostrarResultado(boletim3);

    }

    public static void mostrarResultado(Boletim boletim){

        System.out.println("Média: " + boletim.media());

        if(boletim.verificaAprov()){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
        System.out.println("--------------------");

    }

}