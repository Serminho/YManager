import java.util.Scanner;

public class MenuVendas {

    public static void exibirMenuVendas() {
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

            opMV = scanner.nextInt();

            switch (opMV) {
                case 1:
                    System.out.println("| Registrar Venda selecionado |");
                    System.out.println("| Qual o nome do cliente?");
                    String nomeClienteExistente = scanner.next();
                    while (nomeClienteExistente.isEmpty()) {
                        System.out.println("| O nome do cliente não pode ser vazio. Tente novamente:");
                        nomeClienteExistente = scanner.next();
                    }
                    System.out.println("| Qual o nome da peça vendida?");
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

    
}
