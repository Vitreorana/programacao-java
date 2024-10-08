package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp  implements CommandLineRunner {
    @Autowired // injetei um componente de uma dependencia a outra
    private Calculadora calculadora; // criei um componente que terá como dependência outro objeto calculadora 
    @Override
    public void run(String... args) throws Exception { // e que executa esse método RUN
        System.out.println("O resultado é " + calculadora.somar(2,7)); 
    }
    
}
