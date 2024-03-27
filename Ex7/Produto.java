class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome + ", Código: " + codigo + ", Preço: R$" + preco + ", Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
