import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> imprimirNumeroPar = numero -> { };
        numeros.forEach(n -> {
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
        );
    }
}