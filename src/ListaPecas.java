public class ListaPecas {
    Node cabeca;
    Node cauda;

    public void adicionarUltimo(Object dado) {
        Node novoNo = new Node(dado);
        if (cauda == null){
            cabeca = novoNo;
            cauda = novoNo;
        }
        else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
        }
    }

    public void adicionarInicio(Object dado) {
        Node novoNo = new Node(dado);
        if (cauda == null){
            cabeca = novoNo;
            cauda = novoNo;
        }
        else {
            cabeca.anterior = novoNo;
            novoNo.proximo = cabeca;
            cabeca = novoNo;
        }
    }

    public void removerUltimo() {
        if (cauda == null) {
            return;
        }
        cauda = cauda.anterior;
        if (cauda != null) {
            cauda.proximo = null;
        } else {
            cabeca = null;

        }
    }

    public void removerInicio() {
        if (cabeca == null) {
            return;
        }
        cabeca = cabeca.proximo;
        if (cabeca != null) {
            cabeca.anterior = null;
        } else {
            cauda = null;
        }
    }

    public void percorrerPraFrente() {
        Node atual = cabeca;
        while (atual != null) {
            System.out.print("\n" + atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println("\n---");
    }

    public void percorrerPraTras() {
        Node atual = cauda;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println("---");
    }
}
