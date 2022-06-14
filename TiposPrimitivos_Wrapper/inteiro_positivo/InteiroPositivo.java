import static java.lang.Integer.parseInt;

public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) throws Exception {
        naoEhPositivo(valor);
        this.valor = valor;
    }

    public InteiroPositivo(String valor) throws Exception {
        naoEhPositivo(Integer.parseInt(valor));
        this.valor = Integer.parseInt(valor);

    }
    public Exception naoEhPositivo(Integer valor) throws Exception{
        if(valor<0){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        return null;
    }
    public InteiroPositivo() {
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) throws Exception {
        naoEhPositivo(valor);
        this.valor = valor;
    }

    public boolean ehPrimo() {
        if (this.valor == 1) {
            return false;
        }

        for (int i = 2; i < this.valor; i++) {
            if (this.valor % i == 0)
                return false;
        }

        return true;

    }

}
