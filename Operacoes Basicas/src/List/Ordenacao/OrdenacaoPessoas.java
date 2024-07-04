package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{
    //atributo
    private List<Pessoa> pessoaList;
    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        if(!pessoaList.isEmpty()){
            Collections.sort(pessoasPorIdade, new ComparatorPorIdade());
            return pessoasPorIdade;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
        }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()){
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        }
    public static void main(String[] args){
        //criando uma instância da classe OrdenacaoPessoas:
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // adicionando pessoas à lista:
        ordenacaoPessoas.adicionarPessoa("Alice",20, 1.560);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // exibindo a lista de pessoas adicionadas:
        System.out.println(ordenacaoPessoas.pessoaList);

        //ordenando e exibindo por idade:
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // ordenando e exibindo por altura:
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
    
    }

