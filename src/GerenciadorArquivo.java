import java.io.*;
import java.util.Scanner;

public class GerenciadorArquivo {
    private static final String FILE_PECAS = "pecas.txt";
    private static final String FILE_CLIENTES = "clientes.txt";
    private static final String FILE_VENDAS = "vendas.txt";

    public static void salvarPecas(ListaDupla lista) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PECAS))) {
            Node atual = lista.cabeca;
            while (atual != null) {
                Peca p = (Peca) atual.dado;
                writer.println(p.getNome() + ";" + p.getPreco() + ";" + p.getCusto() + ";" + p.getMaterial());
                atual = atual.proximo;
            }
        } catch (IOException e) {
            System.out.println("| Erro ao salvar peças: " + e.getMessage());
        }
    }

    public static void carregarPecas(ListaDupla lista) {
        File arquivo = new File(FILE_PECAS);
        if (!arquivo.exists()) return;

        try (Scanner leitor = new Scanner(arquivo)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] d = linha.split(";");
                if (d.length >= 4) {
                    Peca p = new Peca(d[0], Integer.parseInt(d[1]), Integer.parseInt(d[2]), d[3]);
                    lista.adicionarUltimo(p);
                }
            }
        } catch (Exception e) {
            System.out.println("| Erro ao carregar peças: " + e.getMessage());
        }
    }

    public static void salvarClientes(ListaDupla lista) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_CLIENTES))) {
            Node atual = lista.cabeca;
            while (atual != null) {
                Cliente c = (Cliente) atual.dado;
                writer.println(c.getNome() + ";" + c.getNumero() + ";" + c.getTotalCompras() + ";" + c.getTotalGasto());
                atual = atual.proximo;
            }
        } catch (IOException e) {
            System.out.println("| Erro ao salvar clientes: " + e.getMessage());
        }
    }

    public static void carregarClientes(ListaDupla lista) {
        File arquivo = new File(FILE_CLIENTES);
        if (!arquivo.exists()) return;

        try (Scanner leitor = new Scanner(arquivo)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] d = linha.split(";");
                if (d.length >= 4) {
                    Cliente c = new Cliente(d[0], d[1]);
                    c.setTotalCompras(Integer.parseInt(d[2]));
                    c.setTotalGasto(Integer.parseInt(d[3]));
                    lista.adicionarUltimo(c);
                }
            }
        } catch (Exception e) {
            System.out.println("| Erro ao carregar clientes: " + e.getMessage());
        }
    }

    public static void salvarVendas(ListaDupla lista) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_VENDAS))) {
            Node atual = lista.cabeca;
            while (atual != null) {
                Vendas v = (Vendas) atual.dado;
                writer.println(v.getCliente().getNome() + ";" + 
                               v.getPeca().getNome() + ";" + 
                               v.getQtVendida() + ";" + 
                               v.getDataPedido());
                atual = atual.proximo;
            }
        } catch (IOException e) {
            System.out.println("| Erro ao salvar vendas: " + e.getMessage());
        }
    }

    public static void carregarVendas(ListaDupla listaVendas, ListaDupla listaPecas, ListaDupla listaClientes) {
        File arquivo = new File(FILE_VENDAS);
        if (!arquivo.exists()) return;

        try (Scanner leitor = new Scanner(arquivo)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] d = linha.split(";");
                if (d.length >= 4) {
                    Cliente cli = buscarClientePorNome(listaClientes, d[0]);
                    Peca pec = buscarPecaPorNome(listaPecas, d[1]);

                    if (cli != null && pec != null) {
                        Vendas v = new Vendas(pec, cli, d[3]);
                        v.setQtVendida(Integer.parseInt(d[2]));
                        listaVendas.adicionarUltimo(v);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("| Erro ao carregar vendas: " + e.getMessage());
        }
    }

    private static Cliente buscarClientePorNome(ListaDupla lista, String nome) {
        Node atual = lista.cabeca;
        while (atual != null) {
            Cliente c = (Cliente) atual.dado;
            if (c.getNome().equalsIgnoreCase(nome)) return c;
            atual = atual.proximo;
        }
        return null;
    }

    private static Peca buscarPecaPorNome(ListaDupla lista, String nome) {
        Node atual = lista.cabeca;
        while (atual != null) {
            Peca p = (Peca) atual.dado;
            if (p.getNome().equalsIgnoreCase(nome)) return p;
            atual = atual.proximo;
        }
        return null;
    }
}