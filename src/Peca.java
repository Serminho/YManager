public class Peca {
    private String nome;
    private float preco;
    private int quantidade;

    public Peca(String nome) {
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
    }
    public Peca(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }
    public Peca(String nome, int quantidade) {
        this.nome = nome;
        this.preco = 0;
        this.quantidade = quantidade;
    }
    public Peca(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Peça: " + nome + " | " + " Preço: " + preco + " | " + " Quantidade: " + quantidade + " | ";
    }
    
}
