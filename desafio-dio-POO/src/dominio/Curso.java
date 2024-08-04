public class Curso extends Conteudo {
    //atributos
    private int cargaHoraria;

    public double calcularXp(){
        return XP_PADRAO * cargaHoraria; //o XP_PADRAO multiplica pela cargaHoraria
    }

    //construtor vazio:
    public Curso(){

    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}