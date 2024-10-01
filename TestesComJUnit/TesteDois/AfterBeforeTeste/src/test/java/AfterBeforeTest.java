package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import main.java.GerenciadorDeConexaoComBancoDeDados;
import main.java.Pessoa;

public class AfterBeforeTest {
    @BeforeClass
    public static void configurarConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }
    @Before
    public void insereDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.insereDados();
    }
    @After
    public void removeDadosDoTeste(){
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa());
    }
    @Test
    public void validarDadosDeRetorno(){
        assertTrue(true);
    }
    @AfterClass
    public static void finalizarConexao(){
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }
}