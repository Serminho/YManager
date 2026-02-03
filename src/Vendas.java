public class Vendas {
    Peca peca;
    Cliente cliente;
    //int qtVendida;
    //String material;
    String dataInicio;
    String dataFim;
    String dataEntrega;
    int horasProdução;
    float valorPorHora;
    //float preco;
    float lucro;
    float frete;
    //float custoTotal;
    float valorPago;
    boolean pago;
    boolean entregue;
    boolean emProducao;
    boolean urgente;
    float ptLucro;
    float descontoAplicado;

    public Vendas(Peca peca, Cliente cliente) {
        this.peca = peca;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "| Venda |\n" + peca + "\n" + cliente;
    }
    
}
