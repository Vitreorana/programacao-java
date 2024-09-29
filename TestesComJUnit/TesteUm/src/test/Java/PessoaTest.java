package tests;
import java.time.LocalDateTime;
import org.junit.Assert;

public class PessoaTest {
    @org.junit.Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa ("jessica", LocalDateTime.of(2000, 1, 1, 15, 00));
        Assert.assertEquals(22, jessica.getIdade());
    }
}