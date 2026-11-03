public class Main {

  public static void main(String[] args) {

    Produto p1 = new Produto("Notebook", 3000, 5);

    p1.adicionarEstoque(3);
    p1.removerEstoque(2);

    p1.mostrarProduto();
  }

}