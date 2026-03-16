public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if(salario >= 1600) {
            this.salario = salario;
        }
        else {
            System.out.println("Valor inferior à um salario minímo!");
        }

    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentoSalario(double percentual){
        salario += salario * (percentual/100) ;
    }

    public void mostrarFuncionario() {

        System.out.println("Nome: "+ nome);
        System.out.println("Salario: "+ salario);
    }



}
