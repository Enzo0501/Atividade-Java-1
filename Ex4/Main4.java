import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogador jogador1 = new Jogador("Player1", 1000, 5);

        int opcao;
        do {
            System.out.println("\n-----Menu-----");
            System.out.println("1. Exibir informações");
            System.out.println("2. Aumentar pontuação");
            System.out.println("3. Subir de nível");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    jogador1.exibirInformacoes();
                    break;
                case 2:
                    System.out.print("Quantos pontos deseja aumentar? ");
                    int pontos = scanner.nextInt();
                    jogador1.aumentarPontuacao(pontos);
                    break;
                case 3:
                    jogador1.subirNivel();
                    break;
                case 4:
                    System.out.println("Fechando programa");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);

    }
}
