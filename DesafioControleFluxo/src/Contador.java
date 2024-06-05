import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try{
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");

		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");

		int parametroDois = scanner.nextInt();
		
		contar(parametroUm, parametroDois);
        scanner.close();
        }
     
    catch(Exception e) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
	static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro.");
        }
        else {
            for (int parametro = 1; parametro <= 100; parametro ++) {
	            System.out.println("Contando...");
            }
    }
    }
}
