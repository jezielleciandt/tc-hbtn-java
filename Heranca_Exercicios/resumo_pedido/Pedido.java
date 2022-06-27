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

    public double calcularTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
            valorTotal += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        return valorTotal;
    }

    public double calcularTotalComDesconto() {

        return calcularTotal() - calcularValorDesconto();
    }

    public double calcularValorDesconto() {

        return calcularTotal() * (getPercentualDesconto() / 100);
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        double valorDesconto = 0;
        for (ItemPedido item : itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %,.2f  Quant: %d  Total: %,.2f\n",
                    item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(),
                    item.getProduto().obterPrecoLiquido(), item.getQuantidade(),
                    item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %,.2f\n", calcularValorDesconto());
        System.out.printf("TOTAL PRODUTOS: %,.2f\n", calcularTotal());
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %,.2f\n", calcularTotalComDesconto());
        System.out.println("----------------------------");
    }
}
