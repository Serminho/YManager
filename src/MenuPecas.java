public class MenuPecas {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao YManager!");
        
        exibirMenuPeca();
    }

    public static void exibirMenuPeca() {
        int opEM = 0;
        ListaDupla listaPecas = new ListaDupla();

        System.out.println("+====================+");
        System.out.println("| 1. Adicionar Peça  |");
        System.out.println("| 2.  Remover Peça   |");
        System.out.println("| 3.  Listar Peças   |");
        System.out.println("| 4.     Sair        |");
        System.out.println("+====================+");
        System.out.println("Escolha uma opção: ");

        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            opEM = scanner.nextInt();

            switch (opEM) {
                case 1:
                    System.out.println("| Adicionar Peça selecionado |");
                    System.out.println("\nQual o nome da peça?");
                    String nomePeca = scanner.next();
                    if (nomePeca.isEmpty()) {
                        System.out.println("A peça deve ter um nome.");
                        exibirMenuPeca();
                        return;
                    }

                    System.out.println("Qual o preço da peça?");
                    int precoPeca = scanner.nextInt();

                    System.out.println("Qual o custo da peça?");
                    int custoPeca = scanner.nextInt();

                    System.out.println("Qual o material da peça?");
                    String materialPeca = scanner.next();

                    Peca novaPeca = new Peca(nomePeca, precoPeca, custoPeca, materialPeca);
                    listaPecas.adicionarUltimo(novaPeca);
                    System.out.println("A peça " + novaPeca + " adicionada com sucesso!");
                    listaPecas.percorrerPraFrente();
                    System.out.println(listaPecas.tamanho + " peça(s) cadastrada(s) no total.");
                    exibirMenuPeca();
                    break;
            
                case 2:
                    System.out.println("Remover Peça selecionado.");
                    System.out.println("Funcionalidade em desenvolvimento.");
                    exibirMenuPeca();
                    break;

                case 3:
                    System.out.println("Listar Peças selecionado.");
                    System.out.println(listaPecas.tamanho);
                    if (listaPecas.tamanho == 0 ) {
                        System.out.println("Nenhuma peça cadastrada.");
                        exibirMenuPeca();
                        break;
                    } else {
                        System.out.println("Lista de Peças:");
                        listaPecas.percorrerPraFrente();
                    }
                    System.out.println("Pressione Enter para continuar...");
                    try (java.util.Scanner continuar = new java.util.Scanner(System.in)) {
                        scanner.nextLine();
                    }
                    exibirMenuPeca();
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default: 
                    System.out.println("Opção inválida. Tente novamente.");
                    exibirMenuPeca();
                    break;
            }
        }


        
    }
    
}