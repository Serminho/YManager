import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDupla listaPecas = new ListaDupla();
        ListaDupla listaClientes = new ListaDupla();
        ListaDupla listaVendas = new ListaDupla();
        
        GerenciadorArquivo.carregarPecas(listaPecas);
        GerenciadorArquivo.carregarClientes(listaClientes);
        GerenciadorArquivo.carregarVendas(listaVendas, listaPecas, listaClientes);
        System.out.println("Bem-vindo ao YManager!");

        int opMPr = 0;
        while (opMPr != 4) {
            System.out.println("\n+=======================+");
            System.out.println("|     Menu Principal    |");
            System.out.println("+=======================+");
            System.out.println("| 1. Gerenciar Peças    |");
            System.out.println("| 2. Gerenciar Vendas   |");
            System.out.println("| 3. Gerenciar Clientes |");
            System.out.println("| 4. Sair               |");
            System.out.println("+=======================+");
            System.out.print("| Escolha uma opção: ");
        
            try {
                opMPr = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("| Erro: Digite apenas números.");
                continue;
            }

            switch (opMPr) {
                case 1:
                    MenuPecas.exibirMenuPeca(listaPecas);
                    break;
                case 2:
                    MenuVendas.exibirMenuVendas(listaVendas, listaPecas, listaClientes);
                    break;
                case 3:
                    MenuClientes.exibirMenuClientes(listaClientes);
                    break;
                case 4:
                    System.out.println("| Saindo do programa...");
                    break;
                default:
                    System.out.println("| Opção inválida.");
                    break;
            }

        }        
        scanner.close();
        System.out.println("| Obrigado por usar o YManager. Até logo!");
    }
}
