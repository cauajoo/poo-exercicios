public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String name, int matricula) {
        this.nome = name;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

}
