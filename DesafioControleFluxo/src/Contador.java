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
        int parametro = parametroDois - parametroUm;
            
        for (int contagem = 1 ; contagem < parametro ; contagem ++) {
            System.out.println("Imprimindo o número " + contagem);
         
        if (parametro == parametroDois)
            break;
            System.out.println("O resultado é " + parametro);
        }         
    }
        catch(Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
	static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro.");
            }
    }
}
