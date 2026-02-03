public class Menu {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao YManager!");
        
        exibirMenu();
    }

    public static void exibirMenu() {
        int opEM = 0;

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
                    System.out.println(" | Adicionar Peça selecionado |");
                    System.out.println("\nQual o nome da peça?");
                    String nomePeca = scanner.next();

                    System.out.println("Qual o preço da peça?");
                    int precoPeca = scanner.nextInt();

                    Peca novaPeca = new Peca(nomePeca, precoPeca);
                    System.out.println("A peça " + novaPeca + " adicionada com sucesso!");

                    exibirMenu();
                    break;
            
                case 2:
                    System.out.println("Remover Peça selecionado.");
                    System.out.println("Funcionalidade em desenvolvimento.");
                    exibirMenu();
                    break;

                case 3:
                    System.out.println("Listar Peças selecionado.");
                    System.out.println("Funcionalidade em desenvolvimento.");
                    exibirMenu();
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default: 
                    System.out.println("Opção inválida. Tente novamente.");
                    exibirMenu();
                    break;
            }
        }


        
    }
    
}