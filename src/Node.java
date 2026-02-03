public class Node {
    Node proximo;
    Node anterior;
    Object dado;

    public Node(Object dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}