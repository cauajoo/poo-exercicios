public class Main {

    public static void main(String[] args){

        Gerente gerente = new Gerente("Caua", 2500);
        Vendedor vendedor = new Vendedor("Maria", 1650);

        Funcionario funcionario = new Funcionario("Pedro", 2000);

        vendedor.aumentoSalario();
        gerente.aumentoSalario();

        funcionario.aumentoSalario(8);

        vendedor.mostrarFuncionario();
        gerente.mostrarFuncionario();

        funcionario.mostrarFuncionario();


    }

}