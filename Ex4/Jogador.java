public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;


    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            this.pontuacao += pontos;
            System.out.println("Pontuação de " + this.nome + " aumentada em " + pontos + " pontos.");
        } else {
            System.out.println("A pontuação deve ser um valor positivo.");
        }
    }


    public void subirNivel() {
        this.nivel++;
        System.out.println(this.nome + " subiu para o nível " + this.nivel + "!");
    }


    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + this.nome);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Nível: " + this.nivel);
    }


    public String getNome() {
        return this.nome;
    }


    public int getPontuacao() {
        return this.pontuacao;
    }


    public int getNivel() {
        return this.nivel;
    }
}
