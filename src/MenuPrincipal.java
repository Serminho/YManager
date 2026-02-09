import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao YManager!");
        exibirMenuPrincipal();
    }

    public static void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
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
        
            opMPr = scanner.nextInt();

            switch (opMPr) {
                case 1:
                    ListaDupla listaPecas = new ListaDupla();
                    MenuPecas.exibirMenuPeca(listaPecas);
                    break;
                case 2:
                    MenuVendas.exibirMenuVendas();
                    break;
                case 3:
                    ListaDupla listaClientes = new ListaDupla();
                    MenuClientes.exibirMenuClientes(listaClientes);
                    break;
                case 4:
                    System.out.println("| Saindo do programa...");
                    break;

                default:
                    System.out.println("| Opção inválida. Tente novamente.");
                    break;
            }

    }
        scanner.close();
        System.out.println("| Obrigado por usar o YManager. Até logo!");
    }
}
