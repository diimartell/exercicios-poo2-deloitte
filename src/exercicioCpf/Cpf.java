package exercicioCpf;

public class Cpf {
    private String cpf;
    //Validação do número do CPF
    public void validarCpf(String cpf) {
        if (cpf.length() == 11) {
            System.out.println("Cpf válido.");
        }
        else {
            System.out.println("CPF inválido.");
        }
    }

    //Aplicando métodos
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
