public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Yasmin Lopes", "123456789");
        Cliente cliente2 = new Cliente("Samuel Rodrigues");
        Peca peca1 = new Peca("Touca", 30, 20, "algodão");
        Peca peca2 = new Peca("Laço", 15);
        
        ListaDupla listaPecas = new ListaDupla();
        listaPecas.adicionarUltimo(peca1);
        listaPecas.adicionarUltimo(peca2);
        listaPecas.percorrerPraFrente();

        ListaDupla listaClientes = new ListaDupla();
        listaClientes.adicionarUltimo(cliente1);
        listaClientes.adicionarUltimo(cliente2);
        listaClientes.percorrerPraFrente();
        
        Vendas venda1 = new Vendas(peca1, cliente1);
        Vendas venda2 = new Vendas(peca2, cliente2);
        System.out.println(venda1);
        System.out.println(venda2);
    }
}
