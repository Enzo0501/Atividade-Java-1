import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        ContaBancaria minhaConta = new ContaBancaria(numeroConta, nomeTitular);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar dinheiro");
            System.out.println("2. Sacar dinheiro");
            System.out.println("3. Sair do programa");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    float valorDeposito = scanner.nextFloat();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    float valorSaque = scanner.nextFloat();
                    minhaConta.sacar(valorSaque);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite novamente.");
            }
        }

        minhaConta.exibirInformacoes();
    }
}