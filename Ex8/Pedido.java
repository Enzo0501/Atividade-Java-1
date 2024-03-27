import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;
    private double valorTotal;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = "";
        this.valorTotal = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        enderecoEntrega = "";
        valorTotal = 0.0;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void exibirRelatorio() {
        System.out.println("### Relatório do Pedido ###");
        if (pizzas.isEmpty()) {
            System.out.println("Nenhuma pizza foi adicionada ao pedido.");
        } else {
            System.out.println("Endereço de entrega: " + enderecoEntrega);
            System.out.println("Valor total do pedido: R$" + valorTotal);
            System.out.println("Número de pizzas no pedido: " + pizzas.size());
            System.out.println("Pizzas no pedido:");
            for (Pizza pizza : pizzas) {
                System.out.println("- " + pizza.getNome() + ": R$" + pizza.getValor());
            }
        }
    }
}
