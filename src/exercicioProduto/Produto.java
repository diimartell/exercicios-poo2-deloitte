package exercicioProduto;

public class Produto {
    private double preco;
    //Cálculo de desconto sob o valor do produto
    public double aplicarDesconto(double preco, double desconto) {
        return preco - (desconto * preco / 100);
    }

    //Aplicando métodos
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
