import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
        scanner.close();
        
        try{
        contar(parametroUm, parametroDois);
        int contagem = parametroDois-parametroUm;
    
        for (int parametro = 1 ; parametro <= parametroDois; contagem ++) {
            System.out.println("Imprimindo  " + contagem++);
        }      
    }
        catch(Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
	static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro.");
        }else {
            for (int parametro = 1 ; parametro <= parametroDois - parametroUm ; parametro ++) {
	            int numero = parametroDois - parametroUm;
                System.out.println("Imprimindo o número  " + numero++);
            }
    }
    }
}
