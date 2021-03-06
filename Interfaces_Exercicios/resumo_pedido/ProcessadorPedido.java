import provedores.ProvedorFrete;

public class ProcessadorPedido {

    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public ProcessadorPedido() {
    }

    public ProvedorFrete getProvedorFrete() {
        return provedorFrete;
    }

    public void processar(Pedido pedido){
        pedido.setFrete(provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal()));
    }
}
