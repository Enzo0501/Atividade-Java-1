import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<>();

        System.out.println("Informe a quantidade de livros que você deseja registrar: ");
        int quantl = Leitor.nextInt();
        Leitor.nextLine();

        for(int i = 0; i < quantl; i++ ) {
            System.out.println("Informe o título do livro: ");
            String titulo = Leitor.nextLine();

            System.out.println("Informe o nome do autor: ");
            String nome = Leitor.nextLine();

            System.out.println("Informe o ano do livro: ");
            int ano = Leitor.nextInt();
            Leitor.nextLine();

            Livro livro = new Livro(titulo, nome, ano);

            livro.exibirInfo();
            biblioteca.add(livro);    
        }
    }
}