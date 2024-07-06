package List.PesquisaEmList;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
public Livro(String titulo, String autor, Integer anoPublicacao){
    this.titulo = titulo;
    this.autor = autor;
}
public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
public Integer getAnoPublicacao(){
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