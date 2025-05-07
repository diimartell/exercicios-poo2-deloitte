package exercicioImc;

public class Imc {
    private double peso;
    private double altura;
    //Cálculo de IMC
    public double calcularIMC(double peso,double altura) {
        return peso/Math.pow(altura,2);
    }

    //Aplicando métodos
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
