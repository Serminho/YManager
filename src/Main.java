public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Yasmin Lopes", "123456789");
        Peca peca1 = new Peca("Touca", 30, 2);
        Peca peca2 = new Peca("Laço", 15);
        
        ListaPecas lista = new ListaPecas();
        lista.adicionarUltimo(peca1);
        lista.adicionarUltimo(peca2);
        lista.percorrerPraFrente();
        
    }
}
