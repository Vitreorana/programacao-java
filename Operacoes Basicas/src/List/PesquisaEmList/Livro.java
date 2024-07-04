package List.PesquisaEmList;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
public Livro(String titulo, String autor, Class<Integer> class1){
    this.titulo = titulo;
    this.autor = autor;
    
}
public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
public int getAnoPublicacao(){
    return anoPublicacao;
}
// vou sobrescrever um toString, pq se eu precisar imprimir a lista de livros,
// não vai aparecer o endereço de memória
public String toString(){
    return "Livro{" + 
    "titulo='" + titulo + '\'' + 
    "autor='" + autor + '\'' +
    ", anoPublicacao*" + anoPublicacao +
    '}';
    }
}