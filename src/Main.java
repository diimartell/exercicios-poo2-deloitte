import exercicioImc.Imc;
import exercicioCpf.Cpf;
import exercicioProduto.Produto;

public class Main {
    public static void main(String[] args) {
        //Exibindo informações no terminal
        Cpf novoCpf = new Cpf();
        novoCpf.setCpf("15874632954");
        novoCpf.validarCpf(novoCpf.getCpf());

        Imc valorImc = new Imc();
        valorImc.setPeso(65);
        valorImc.setAltura(1.70);
        double imcCalculo = valorImc.calcularIMC(valorImc.getPeso(), valorImc.getAltura());
        System.out.println(Math.round(imcCalculo));

        Produto maionese = new Produto();
        maionese.setPreco(3.80);
        double precoMaioneseDescontado = maionese.aplicarDesconto(maionese.getPreco(), 15);
        System.out.println("Preço da maionese com o desconto aplicado: " + precoMaioneseDescontado);
    }
}