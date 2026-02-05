public class Vendas {
    Peca peca;
    Cliente cliente;
    int qtVendida;
    String dataPedido;
    String dataInicio;
    String dataFim;
    String dataEntrega;
    int horasProdução;
    int valorPorHora = 500;
    int lucro;
    int frete;
    int valorPago;
    boolean pago;
    boolean entregue;
    int ptLucro;
    int descontoAplicado;

    public Vendas(Peca peca, Cliente cliente) {
        this.peca = peca;
        this.cliente = cliente;
    }

    public Vendas(Peca peca, Cliente cliente, String dataPedido) {
        this.peca = peca;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.descontoAplicado = 0;
        this.horasProdução = 0;
        this.lucro = 0;
        this.frete = 0;
        this.valorPago = 0;
        this.pago = false;
        this.entregue = false;
        this.ptLucro = 0;
    }

    public Peca getPeca() {
        return peca;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public int getQtVendida() {
        return qtVendida;
    }
    public String getDataPedido() {
        return dataPedido;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public String getDataFim() {
        return dataFim;
    }
    public String getDataEntrega() {
        return dataEntrega;
    }
    public int getHorasProdução() {
        return horasProdução;
    }
    public int getValorPorHora() {
        return valorPorHora;
    }
    public int getLucro() {
        return lucro;
    }
    public int getFrete() {
        return frete;
    }
    public int getValorPago() {
        return valorPago;
    }
    public boolean isPago() {
        return pago;
    }
    public boolean isEntregue() {
        return entregue;
    }
    public int getPtLucro() {
        return ptLucro;
    }
    public int getDescontoAplicado() {
        return descontoAplicado;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setQtVendida(int qtVendida) {
        this.qtVendida = qtVendida;
    }
    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    public void setHorasProdução(int horasProdução) {
        this.horasProdução = horasProdução;
    }
    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public void setLucro(int lucro) {
        this.lucro = lucro;
    }
    public void setFrete(int frete) {
        this.frete = frete;
    }
    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }
    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
    public void setPtLucro(int ptLucro) {
        this.ptLucro = ptLucro;
    }
    public void setDescontoAplicado(int descontoAplicado) {
        this.descontoAplicado = descontoAplicado;
    }


    @Override
    public String toString() {
        return "| Venda |\n" + peca + "\n" + cliente;
    }
    
}
