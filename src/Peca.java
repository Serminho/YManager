public class Peca {
    private String nome;
    private int preco;
    private int custo;
    String material;

    public Peca(String nome, int preco, int custo, String material) {
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
        this.material = material;
    }
    public Peca(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.custo = 0;
        this.material = "Material Indefinido";
    }
    public Peca(String nome, int preco, int custo) {
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
        this.material = "Material Indefinido";
    }

    public String getNome() {
        return nome;
    }
    public int getPreco() {
        return preco;
    }
    public String getMaterial() {
        return material;
    }
    public int getCusto() {
        return custo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "| Peça: " + nome + " | " + " Preço: " + preco + " | " +  " Custo: " + custo + " | " + " Material: " + material + " | ";
    }
    
}
