public class Gerente extends Funcionario {

    public Gerente(String nome, double salario){
        super(nome, salario);

    }

    public void aumentoSalario(){
        super.aumentoSalario(5);

    }
}
