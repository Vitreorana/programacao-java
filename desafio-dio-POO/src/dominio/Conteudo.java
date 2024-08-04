public abstract class Conteudo{
    protected public static final double XP_PADRAO = 10d; // qdo colocamos 'final' significa que o XP_PADRAO é uma constante
    }
    private String titulo;
    private String descricao;

    public double calcularXp() {
        return 0;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setdescricao(String descricao){
        this.descricao = descricao;
        
    }
