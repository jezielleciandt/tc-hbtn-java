package provedores;

public class Sedex implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        return peso > 1000.00? new Frete(valor*0.10,obterTipoProvedorFrete()) : new Frete(valor*0.05, obterTipoProvedorFrete());
    }

    private TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.SEDEX;
    }
}
