import java.util.Scanner;

public class MenuClientes {

    public static void exibirMenuClientes() {
        ListaDupla listaClientes = new ListaDupla();
        exibirMenuClientes(listaClientes);
    }

    public static void exibirMenuClientes(ListaDupla listaClientes) {
        Scanner scanner = new Scanner(System.in);
        int opMC = 0;

        while (opMC != 5) {
            System.out.println("\n+=======================+");
            System.out.println("|      Menu Clientes    |");
            System.out.println("+=======================+");
            System.out.println("| 1.  Registrar Cliente |");
            System.out.println("| 2.  Remover Cliente   |");
            System.out.println("| 3.  Editar Cliente    |");
            System.out.println("| 4.  Listar Clientes   |");
            System.out.println("| 5.     Voltar         |");
            System.out.println("+=======================+");
            System.out.print("| Escolha uma opção: ");

            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) {
                System.out.println("| Opção inválida.");
                continue;
            }
            try {
                opMC = Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("| Opção inválida.");
                continue;
            }

            switch (opMC) {
                case 1:
                    registrarCliente(scanner, listaClientes);
                    break;
                case 2:
                    System.out.println("| Remover Cliente selecionado |");
                    break;
                case 3:
                    System.out.println("| Editar Cliente selecionado |");
                    break;
                case 4:
                    System.out.println("| Listar Clientes selecionado |");
                    listaClientes.percorrerPraFrente();
                    break;
                case 5:
                    System.out.println("| Voltando...");
                    break;
                default:
                    System.out.println("| Opção inválida.");
            }
        }
    }

    private static void registrarCliente(Scanner scanner, ListaDupla listaClientes) {
        System.out.println("| Registrar Cliente selecionado |");
        System.out.print("| Qual o nome do cliente? ");
        String nomeCliente = scanner.nextLine().trim();
        while (nomeCliente.isEmpty()) {
            System.out.print("| O nome do cliente não pode ser vazio. Tente novamente: ");
            nomeCliente = scanner.nextLine().trim();
        }

        System.out.print("| Qual o número do cliente? (enter para pular) ");
        String numeroCliente = scanner.nextLine().trim();
        if (numeroCliente.isEmpty()) {
            numeroCliente = "Nenhum número cadastrado";
        }

        Cliente cliente = new Cliente(nomeCliente, numeroCliente);
        System.out.println("| Dados do cliente:");
        System.out.println("| " + cliente);

        System.out.print("| Confirma salvar? (S/N): ");
        String confirm = scanner.nextLine().trim();
        if (confirm.equalsIgnoreCase("S")) {
            listaClientes.adicionarUltimo(cliente);
            System.out.println("| Cliente registrado com sucesso!");
        } else {
            System.out.println("| Cadastro cancelado.");
        }
    }
}