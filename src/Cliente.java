public class Cliente {
    private String nome;
    private String numero;
    private int totalCompras;
    private int totalGasto;


    public Cliente(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.totalCompras = 0;
        this.totalGasto = 0;
    }
    public Cliente(String nome) {
        this.nome = nome;
        this.numero = "Nenhum número cadastrado";
        this.totalCompras = 0;
        this.totalGasto = 0;
    }
    
    public String getNome() {
        return nome;
    }
    public String getNumero() {
        return numero;
    }
    public int getTotalCompras() {
        return totalCompras;
    }
    public int getTotalGasto() {
        return totalGasto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }
    public void setTotalGasto(int totalGasto) {
        this.totalGasto = totalGasto;
    }

    public void adicionarCompra(int valor) {
        this.totalCompras++;
        this.totalGasto += valor;
    }

    public void removerCompra(int valor) {
        if (this.totalCompras > 0) {
            this.totalCompras--;
            this.totalGasto -= valor;
        }
        else {
            System.out.println("| O cliente não possui compras para remover.");
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | " + " Numero: " + numero + " | ";
    }
    
}
