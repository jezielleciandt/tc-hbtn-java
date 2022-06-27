public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }
    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public double calcularTotal(){
        double valorTotal = 0;
        for(ItemPedido item: itens) {
            valorTotal += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        return valorTotal * (1 - (getPercentualDesconto() / 100));
    }
}
