
package List.PesquisaEmList;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo:
    private List <Livro> livroList; // A minha lista vai se chamar livroList
        // para usar o atributo List, tem que importar o java.util.list

    public CatalogoLivros(){
        this.livroList = new ArrayList<>(); // o livroList é uma ArrayList vazia

    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){ // pesquisar a lista de Livros, pq pode ter mais de um livro por autor
        List<Livro>livrosPorAutor = new ArrayList<>(); 
        // primeiro preciso saber se a lista esta vazia, se não não preciso desenvolver esse método:
        if(!livroList.isEmpty()){
        //O pronto de exclamação acima é pra fazer a negativa
        // Se a lista estiver vazia, ele retorna True; se tiver algum elemente, ele retorna False
          for(Livro l : livroList){
            if(l.getAutor().equalsIgnoreCase(autor)){ // se o livro for do mesmo autor que vamos pesquisar          
                livrosPorAutor.add(l); //nós adicionamos a lista
        }
    }
}
        return livrosPorAutor;
}
    public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                    if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal);
                    List<Livro> livrosPorIntervaloAnos;
                    livrosPorIntervaloAnos.add(l);
            }   
            }
    
    return pesquisarPorIntervaloAnos(0, 0);
    }
public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null; // está null pq não temos nenhum objeto do tipo livro a partir dese titulo
    if(!livroList.isEmpty()){
        for(Livro l : livroList) {
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
    }
    return livroPorTitulo;
}
public static void main(String[] args){
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Livro 1", "Autor 1", "2020");
    catalogoLivros.adicionarLivro("Livro 1", "Autor 2", "2021");
    catalogoLivros.adicionarLivro("Livro 2", "Autor 2", "2022");
    catalogoLivros.adicionarLivro("Livro 3", "Autor 3", "2023");
    catalogoLivros.adicionarLivro("Livro 4", "Autor 4", "1994");
}
}
