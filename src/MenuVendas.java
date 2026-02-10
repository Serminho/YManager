import java.util.Scanner;

public class MenuVendas {

    public static void exibirMenuVendas(ListaDupla listaVendas, ListaDupla listaPecas, ListaDupla listaClientes) {
        Scanner scanner = new Scanner(System.in);
        int opMV = 0;

        while (opMV != 5) {
            System.out.println("\n+=====================+");
            System.out.println("|     Menu Vendas     |");
            System.out.println("+=====================+");
            System.out.println("| 1.  Registrar Venda |");
            System.out.println("| 2.  Remover Venda   |");
            System.out.println("| 3.  Editar Venda    |");
            System.out.println("| 4.  Listar Vendas   |");
            System.out.println("| 5.     Voltar       |");
            System.out.println("+=====================+");
            System.out.print("| Escolha uma opção: ");

            try {
                opMV = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("| Opção inválida.");
                continue;
            }

            switch (opMV) {
                case 1:
                    System.out.println("| Nome do Cliente:");
                    String nc = scanner.nextLine();
                    System.out.println("| Nome da Peça:");
                    String np = scanner.nextLine();

                    Cliente cli = buscarCliente(listaClientes, nc); 
                    Peca pec = buscarPeca(listaPecas, np);

                    if (cli != null && pec != null) {
                        Vendas novaVenda = new Vendas(pec, cli, "09/02/2026");
                        System.out.println("| Quantidade vendida?");
                        novaVenda.setQtVendida(Integer.parseInt(scanner.nextLine()));
            
                        listaVendas.adicionarUltimo(novaVenda);
                        GerenciadorArquivo.salvarVendas(listaVendas); // SALVA NO ARQUIVO
                        System.out.println("| Venda registrada e salva!");
                    } else {
                        System.out.println("| Erro: Cliente ou Peça não encontrados!");
                    }
                    break;

                case 2:
                    System.out.println("| Saindo do menu de vendas...");
                    break;
                
                case 5:
                    System.out.println("| Saindo do menu de vendas...");
                    break;

                default:
                    System.out.println("| Opção inválida.");
                    break;
            }
        }
    }

    private static Cliente buscarCliente(ListaDupla lista, String nome) {
        Node atual = lista.cabeca;
        while (atual != null) {
            Cliente c = (Cliente) atual.dado;
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
            atual = atual.proximo;
        }
        return null;
    }

    private static Peca buscarPeca(ListaDupla lista, String nome) {
        Node atual = lista.cabeca;
        while (atual != null) {
            Peca p = (Peca) atual.dado;
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
            atual = atual.proximo;
        }
        return null;
    }
}
