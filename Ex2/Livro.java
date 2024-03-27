public class Livro {
  
    String title;
    String nm;
    int year;

    Livro(String titulo, String nome, int ano){
        title = titulo;
        nm = nome;
        year = ano;
    }

    public void exibirInfo(){
        System.out.println("Título: " + title);
        System.out.println("Autor: " + nm);
        System.out.println("Ano de Publicação: " + year);
    }
}