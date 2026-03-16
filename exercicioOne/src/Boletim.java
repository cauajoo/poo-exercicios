public class Boletim {

    private Aluno aluno;
    private double notaOne;
    private double notaTwo;

    public Boletim(Aluno aluno, double notaOne, double notaTwo) {
        this.aluno = aluno;
        setNotaOne(notaOne);
        setNotaTwo(notaTwo);

    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setNotaOne(double notaOne) {
        if (notaOne >= 0 && notaOne < 10){
            this.notaOne = notaOne;
        }
        else{
            System.out.println("Nota inválida!");
        }
    }

    public void setNotaTwo(double notaTwo) {
        if (notaTwo >= 0 && notaTwo <= 10){
            this.notaTwo = notaTwo;
        }
        else{
            System.out.println("Nota inválida!");
        }
    }

    public double media(){
        return (notaOne + notaTwo)/2;
    }

    public boolean verificaAprov(){
        return media() >= 7;
    }
}
