import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;

    private double saldo;

    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }else {
            this.saldo += valor;
        }
    }
    public void sacar(double valor) throws OperacaoInvalidaException {
        if( valor <= 0 ){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else if (getSaldo() < valor) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        } else {
            this.saldo -= valor;
        }
    }

    public double calcularTarifaMensal(){
        if(this.saldo * 0.1 > 10.0){
            return 10.0;
        }
        return this.saldo * 0.1;
    }

    public double calcularJurosMensal(){
        if(getSaldo() < 0 ){
            return 0;
        }
        return getSaldo() * (getTaxaJurosAnual()/12/100);
    }

    public void aplicarAtualizacaoMensal(){
        this.saldo += calcularJurosMensal() - calcularTarifaMensal();
    }

    public void descontaTarifa(double tarifa){
        this.saldo -= tarifa;
    }
}
