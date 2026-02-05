import java.util.Scanner;

public class MenuClientes {

    public static void exibirMenuClientes() {
        Scanner scanner = new Scanner(System.in);
        int opMC = 0;

        while (opMC != 5) {
            System.out.println("\n+=====================+");
            System.out.println("|     Menu Clientes   |");
            System.out.println("+=====================+");
            System.out.println("| 1.  Registrar Cliente |");
            System.out.println("| 2.  Remover Cliente   |");
            System.out.println("| 3.  Editar Cliente    |");
            System.out.println("| 4.  Listar Clientes   |");
            System.out.println("| 5.     Voltar       |");
            System.out.println("+=====================+");
            System.out.print("| Escolha uma opção: ");

            opMC = scanner.nextInt();

            switch (opMC) {
                case 1:
                    System.out.println("| Registrar Cliente selecionado |");
                    System.out.println("| Qual o nome do cliente?");
                    String nomeCliente = scanner.next();
                    while (nomeCliente.isEmpty()) {
                        System.out.println("| O nome do cliente não pode ser vazio. Tente novamente:");
                        nomeCliente = scanner.next();
                    }
                    System.out.println("| Qual o número do cliente?");
                    String numeroCliente = scanner.next();
                    if (numeroCliente.isEmpty()) {
                        numeroCliente = "Nenhum número cadastrado";
                    }
                    Cliente cliente = new Cliente(nomeCliente, numeroCliente);
                    System.out.println("| Cliente registrado com sucesso!");
                    break;
                case 2:
                    System.out.println("| Remover Cliente selecionado |");
                    break;
                case 3:
                    System.out.println("| Editar Cliente selecionado |");
                    break;
                case 4:
                    System.out.println("| Listar Clientes selecionado |");
                    break;
                default:
                    System.out.println("| Opção inválida.");
            }
        }
    }
}