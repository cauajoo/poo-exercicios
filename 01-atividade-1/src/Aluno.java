public class Aluno{
    private String nome;
    private int matricula;
    private int turma;

    public Aluno(String nome, int matricula, int turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", turma=" + turma +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
