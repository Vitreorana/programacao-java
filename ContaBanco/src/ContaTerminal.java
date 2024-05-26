import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ;
                    
        System.out.println("Por favor, digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenome  = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência");
        String numeroAgencia = scanner.next();
        
        System.out.println("Por favor, digite seu número de conta");
        int numeroConta = scanner.nextInt();
        
        double saldo = 237.48;

        System.out.println("Olá," + nome + " " + sobrenome + " obrigada por criar uma conta em nosso banco, sua agência é " + numeroAgencia + "," + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
        scanner.close();

    }

}
