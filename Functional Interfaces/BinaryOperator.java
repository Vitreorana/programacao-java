import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        int resultado = numeros.stream()
            .reduce(0, somar);
        System.out.println ("A soma dos números é: " + resultado);
    }
    
}
