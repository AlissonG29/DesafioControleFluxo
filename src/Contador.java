import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite seu 1º número positivo:");
        int n1 = terminal.nextInt();

        System.out.println("Digite seu 1º número positivo:");
        int n2 = terminal.nextInt();

        System.out.println("Seus numeros: " + n1 + " e " + n2);

        try {
            analisarNumeros(n1, n2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Seu primeiro numero não  pode ser maior que o segundo.");
        }

    }

    static void analisarNumeros(int n1, int n2) throws ParametrosInvalidosException {

        if (n1 > n2) {
            throw new ParametrosInvalidosException("");
        }
        int cont = n2 - n1;
        System.out.println("Imprimindo iterações do primeiro até o segundo número");
        for (int i = 0; i < cont; i++) {

            System.out.println(n1 + i);
        }
    }

}