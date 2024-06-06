import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;
        boolean continuar = true;

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:{
                  System.out.println("Qual o valor a ser depositado?");
                    System.out.println(saldo);
                  System.out.println("Saldo atual: " + saldo %1f);
                    break;
                }   
                case 2:{
                  System.out.println("Qual o valor a ser sacado?");
                  int valor = saldo;
                  
                    if (valor > saldo) {
                      System.out.println("Saldo insuficiente.");
                    }
                    else {
                      System.out.println("Saldo atual: " + saldo %1f);
                      
                    }
                    break;
                }
                case 3:{
                  System.out.println("Saldo atual: " + saldo %1f);
                    break;
                }
                case 0:{
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
