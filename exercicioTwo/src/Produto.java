public class Produto {

    private String nome;
    private int quantidade;
    private double valor;

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        setQuantidade(quantidade);
        setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            System.out.println("Preço inválido!");
        }
    }

    public void adicionarEstoque(int quantia) {
        if (quantia > 0) {
            quantidade += quantia;
        }
    }

    public void removerEstoque(int quantia) {
        if (quantia > 0 && quantidade - quantia >= 0) {
            quantidade -= quantia;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public double calcularValorTotal() {
        return valor * quantidade;
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + valor);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total em estoque: " + calcularValorTotal());
    }
}