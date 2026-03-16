public class Vendedor extends Funcionario{

    public Vendedor(String nome, double salario){
        super(nome, salario);

    }

    public void aumentoSalario(){
        super.aumentoSalario(3);

    }
}
