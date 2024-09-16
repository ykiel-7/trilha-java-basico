import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int primeiroNumero = 0;
        int segundoNumero = 0;

        System.out.println("Insira o primeiro número: ");
        primeiroNumero = ler.nextInt();

        System.out.println("Insira o segundo número: ");
        segundoNumero = ler.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }
        ler.close();
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
    
}
