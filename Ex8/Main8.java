import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pizza> pizzasDisponiveis = criarPizzas();

        Pedido pedido = new Pedido();

        System.out.println("Ola seja bem vindo a pizzaria Java!");
        System.out.println("Nosso Menu de Pizzas:");
        exibirMenuPizzas(pizzasDisponiveis);
        boolean continuarPedido = true;
        while (continuarPedido) {
            System.out.print("Escolha o número da pizza que deseja adicionar ao pedido (ou 0 para encerrar): ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 0) {
                continuarPedido = false;
            } else if (escolha > 0 && escolha <= pizzasDisponiveis.size()) {
                Pizza pizzaEscolhida = pizzasDisponiveis.get(escolha - 1);
                pedido.adicionarPizza(pizzaEscolhida);
                System.out.println(pizzaEscolhida.getNome() + " adicionada ao pedido.");
            } else {
                System.out.println("Opção inválida. Por favor, escolha um número válido.");
            }
        }

        System.out.print("Por favor, insira o endereço de entrega: ");
        String enderecoEntrega = scanner.nextLine();
        pedido.setEnderecoEntrega(enderecoEntrega);

        pedido.exibirRelatorio();
    }

    private static List<Pizza> criarPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Mussarela", 25.0, List.of("Molho de tomate", "Queijo mussarela")));
        pizzas.add(new Pizza("Calabresa", 28.0, List.of("Molho de tomate", "Queijo", "Calabresa")));
        pizzas.add(new Pizza("Portuguesa", 30.0, List.of("Molho de tomate", "Queijo", "Presunto", "Ovo", "Cebola", "Azeitona")));
        return pizzas;
    }

    private static void exibirMenuPizzas(List<Pizza> pizzas) {
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println((i + 1) + ". " + pizza.getNome() + " - R$" + pizza.getValor());
        }
    }
}
