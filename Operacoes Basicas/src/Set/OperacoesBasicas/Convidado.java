package Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos:
    private String nome;
    private Integer codigoConvite;
    //constructor:
public Convidado(String nome, int codigoConvite){
    this.nome = nome;
    this.codigoConvite = codigoConvite;
}
public String getNome(){
    return nome;
}
public int getCodigoConvite(){
    return codigoConvite;
}
public boolean equals(Object o){
    if(this ==o) return true;
    if(!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
}
// para dizer qual elemento vc quer que seja comparado para dizer que um elemento é igual ao outro ou não:
public int hashCode(){
    return Objects.hash(getCodigoConvite());
}
public String toString(){
    return "Convidado{" +
    "nome=" + nome + '\'' +
    ", codigoConvite=" + codigoConvite +
    '}';
}
}
