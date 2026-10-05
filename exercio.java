public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        System.out.println("O livro " + titulo + ", escrito por " + autor + ", possui " + paginas + " páginas.");
    }
}

public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Dom Casmurro", "Machado de Assis", 208);
        meuLivro.exibirDetalhes();
    }
}
