package provedores;

public class JadLog implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
            return peso > 2000.00? new Frete(valor * 0.07, obterTipoProvedorFrete()): new Frete(valor*0.045, obterTipoProvedorFrete());
    }

    private TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.JADLOG;
    }
}
