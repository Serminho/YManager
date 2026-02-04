import java.util.Scanner;

public class MenuPecas {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao YManager!");
        ListaDupla listaPecas = new ListaDupla();
        exibirMenuPeca(listaPecas);
    }

    public static void exibirMenuPeca(ListaDupla listaPecas) {
        Scanner scanner = new Scanner(System.in);
        int opEM = 0;

        
        while (opEM != 4) {
            System.out.println("\n+====================+");
            System.out.println("| 1. Adicionar Peça  |");
            System.out.println("| 2.  Remover Peça   |");
            System.out.println("| 3.  Listar Peças   |");
            System.out.println("| 4.     Sair        |");
            System.out.println("+====================+");
            System.out.print("| Escolha uma opção: ");

            opEM = scanner.nextInt();

            switch (opEM) {
                case 1:
                    System.out.println("| Adicionar Peça selecionado |");
                    System.out.println("| Qual o nome da peça?");
                    String nomePeca = scanner.next();
                    while (nomePeca.isEmpty()) {
                        System.out.println("| O nome da peça não pode ser vazio. Tente novamente:");
                        nomePeca = scanner.next();
                    }
                    while (nomePeca.length() < 3) {
                        System.out.println("| O nome da peça deve ter pelo menos 3 caracteres. Tente novamente:");
                        nomePeca = scanner.next();
                    }
                    
                    System.out.println("| Qual o preço da peça?");
                    int precoPeca = scanner.nextInt();
                    while (precoPeca <= 0) {
                        System.out.println("| O preço da peça deve ser maior que zero. Tente novamente:");
                        precoPeca = scanner.nextInt();
                    }

                    System.out.println("| Qual o custo da peça?");
                    int custoPeca = scanner.nextInt();
                    while (custoPeca < 0) {
                        System.out.println("| O custo da peça não pode ser negativo. Tente novamente:");
                        custoPeca = scanner.nextInt();
                    }

                    System.out.println("| Qual o material da peça?");
                    String materialPeca = scanner.next();
                    if (materialPeca.isEmpty()) {
                        materialPeca = "Indefinido";
                    }

                    Peca novaPeca = new Peca(nomePeca, precoPeca, custoPeca, materialPeca);
                    listaPecas.adicionarUltimo(novaPeca);
                    
                    System.out.println("| A peça " + nomePeca + " foi adicionada!");
                    pausar(scanner);

                    break;

                case 2:
                    System.out.println("| Remover Peça selecionado |");
                    if (listaPecas.tamanho == 0) {
                        System.out.println("| A lista está vazia.");
                    } else {
                        System.out.println("| Qual o nome da peça a remover?");
                        String nomePecaRemover = scanner.next();
                        
                        boolean removido = listaPecas.removerMeio(nomePecaRemover);
                        
                        if (removido) {
                            System.out.println("| A peça " + nomePecaRemover + " foi removida.");
                        } else {
                            System.out.println("| A peça '" + nomePecaRemover + "' não encontrada no sistema.");
                        }
                    }
                    pausar(scanner);
                    break;

                case 3:
                    System.out.println("| Lista de Peças |");
                    if (listaPecas.tamanho == 0) {
                        System.out.println("| Nenhuma peça cadastrada.");
                    } else {
                        listaPecas.percorrerPraFrente();
                        System.out.println("| Total: " + listaPecas.tamanho + " peça(s).");
                    }
                    pausar(scanner);
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }

    public static void pausar(Scanner scanner) {
        System.out.print("\nPressione Enter para continuar...");
        scanner.nextLine();
        scanner.nextLine();
    }

}