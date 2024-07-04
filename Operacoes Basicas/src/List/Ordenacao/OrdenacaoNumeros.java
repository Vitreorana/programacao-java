package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos:
    private List <Integer> numerosList;

    //constructor:
    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        }
    public void exibirNumeros(){
        if (!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        }else{
            System.out.println("A lista está vazia!");
        }
        }
    public static void main(String[] args) {
        //criando uma instancia da classe OrdenacaoNumeros:
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        //adicionando numeros à lista:
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        //exibindo a lista de números adicionados:
        numeros.exibirNumeros();

        //ordenando e exibindo em ordem ascendente:
        System.out.println(numeros.ordenarAscendente());

        //exibindo a lista:
        numeros.exibirNumeros();

        //ordenando e exibindo em ordem descendente:
        System.out.println(numeros.ordenarDescendente());

        //exibindo a lista:
        numeros.exibirNumeros();
    }
    }

