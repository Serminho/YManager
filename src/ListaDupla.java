public class ListaDupla {
    Node cabeca;
    Node cauda;
    int tamanho = 0;

    public void adicionarUltimo(Object dado) {
        Node novoNo = new Node(dado);
        if (cauda == null){
            cabeca = novoNo;
            cauda = novoNo;
            tamanho++;
        }
        else {
            cauda.proximo = novoNo;
            novoNo.anterior = cauda;
            cauda = novoNo;
            tamanho++;
        }
    }

    public void adicionarInicio(Object dado) {
        Node novoNo = new Node(dado);
        if (cauda == null){
            cabeca = novoNo;
            cauda = novoNo;
            tamanho++;
        }
        else {
            cabeca.anterior = novoNo;
            novoNo.proximo = cabeca;
            cabeca = novoNo;
            tamanho++;
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
        tamanho--;
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
        tamanho--;
    }

    public void percorrerPraFrente() {
        Node atual = cabeca;
        while (atual != null) {
            System.out.print("\n| " + atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println("\n+======");
    }

    public void percorrerPraTras() {
        Node atual = cauda;
        while (atual != null) {
            System.out.print("\n" + atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println("\n===");
    }

    public boolean removerMeio(String nomePecaRemover) {
        Node atual = cabeca;
        while (atual != null) {
            Peca pecaAtual = (Peca) atual.dado;
            if (pecaAtual.getNome().equalsIgnoreCase(nomePecaRemover)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    cabeca = atual.proximo;
                }
            
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    cauda = atual.anterior;
                }
            
                tamanho--;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}
