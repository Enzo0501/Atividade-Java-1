import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();

        boolean executando = true;
        while (executando) {
            System.out.println("\n### MENU ###");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Visualizar Relatório de Estoque");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, scanner);
                    break;
                case 2:
                    visualizarRelatorioEstoque(estoque);
                    break;
                case 3:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void adicionarProduto(List<Produto> estoque, Scanner scanner) {
        System.out.println("\n### Adicionar Produto ###");
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(produto);

        System.out.println("Produto adicionado com sucesso.");
    }

    private static void visualizarRelatorioEstoque(List<Produto> estoque) {
        System.out.println("\n### Relatório de Estoque ###");
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto cadastrado no estoque.");
        } else {
            for (Produto produto : estoque) {
                produto.exibirProduto();
            }
        }
    }
}
