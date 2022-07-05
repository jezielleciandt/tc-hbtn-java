package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        return peso > 5000.00? new Frete(valor*0.12, obterTipoProvedorFrete()) : new Frete(valor*0.04, obterTipoProvedorFrete());
    }

    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.LOGGI;
    }
}
