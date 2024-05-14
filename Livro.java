public class Livro {
    String titulo;
    String autor;
    String editora;
    int anoPublicacao;

    void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}
