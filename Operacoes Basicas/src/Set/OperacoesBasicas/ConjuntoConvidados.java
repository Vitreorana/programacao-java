package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
    //atributo:
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }
    //métodos:
    public void adicionarConvidadoPorCodigoConvite(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        // se o convidado cujo código de convite for igual ao codigo c, 
        // nós vamos remover o convidado:
        if(!convidadosSet.isEmpty()){
            for (Convidado c: convidadosSet){
                if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                // feito isso eu paro esse laço de repetição, 
                // pq se eu encontrei um elemento dentro de um set, não vai ter mais um igual a esse,
                //então eu paro:
                break; 
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }else{
        throw new RuntimeException("O conjunto está vazio!");
    }
    }
    public int contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidado(){
        if (!convidadosSet.isEmpty()){
            System.out.println(convidadosSet);
        }else{
            System.out.println("O conjunto está vazio!");
        }
        }
    public static void main(String[] args){
        //criando uma instância da classe ConjuntoConvidados:
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //exibindo o número de convidados no conjunto (deve ser zero):
        System.out.println("Existem" + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
 
        // adicionando convidados ao conjunto:
        conjuntoConvidados.adicionarConvidadoPorCodigoConvite("Alice", 1234);
        conjuntoConvidados.adicionarConvidadoPorCodigoConvite("Bob", 1235);
        conjuntoConvidados.adicionarConvidadoPorCodigoConvite("Charlie", 1235);
        conjuntoConvidados.adicionarConvidadoPorCodigoConvite("David", 1236);

        //exibindo os convidados no conjunto:
        System.out.println("Convidaados no conjunto:");
        conjuntoConvidados.exibirConvidado();

        //exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem"+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        //removendo um convidado do conjunto por código de convite:
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("existem" + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        //exibindo os convidados atualizados no conjunto:
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidado();
    }
    }
