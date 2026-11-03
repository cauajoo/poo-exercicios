public class Boletim {

    private Aluno aluno;
    private double notaOne;
    private double notaTwo;

    public Boletim(Aluno aluno, double notaOne, double notaTwo) {
        this.aluno = aluno;
        this.notaOne = notaOne;
        this.notaTwo = notaTwo;
    }

    public boolean validacaoNota(double nota){
        return nota > 0 && nota < 10;
    }

    public double med(){

        double media = (notaOne + notaTwo)/2;

        if(media >= 7){
            System.out.printf("Aluno(a): %s está aprovado!", this.aluno.getNome());
        }
        else{
            System.out.printf("Aluno(a): %s está aprovado!", this.aluno.getNome());
        }

        return media;

    }

    @Override
    public String toString() {
        return "\n"+
                "Boletim: " +
                " 1ªNota: " + notaOne +
                " 2ªNota: " + notaTwo +
                " Media: " + med();
    }


}
