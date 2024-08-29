import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = ler.nextInt();

        System.out.println("Insira o número da sua agência: ");
        agencia = ler.next();

        System.out.println("Informe seu nome completo: ");
        nomeCliente = ler.next();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível!!");

        ler.close();
    
    }
}
