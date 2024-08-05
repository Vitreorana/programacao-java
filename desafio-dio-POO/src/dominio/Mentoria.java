import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //atributos
    private LocalDate data;

    public double calcularXp(){
        return XP_PADRAO + 20d;
    }
    
    //construtor vazio:
    public Mentoria(){

    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

	
}
