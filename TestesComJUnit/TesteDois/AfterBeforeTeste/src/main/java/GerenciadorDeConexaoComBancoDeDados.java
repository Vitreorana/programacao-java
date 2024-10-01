package main.java;
import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {
    public static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());
    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão.");
    }
    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão.");
    }
    @SuppressWarnings("hiding")
    public static <Pessoa> void insereDados(){
        LOGGER.info("Inseriu dados.");
    }
    @SuppressWarnings("hiding")
    public static <Pessoa> void removeDados(Pessoa pessoa){
        LOGGER.info("Removeu dados.");
    }
}
