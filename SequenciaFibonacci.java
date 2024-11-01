import java.util.Scanner;

public class SequenciaFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            boolean pertence = pertenceFibonacci(numero);

            if (pertence) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
            }

            System.out.print("Deseja digitar outro número? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    public static boolean pertenceFibonacci(int numero) {
        if (numero <= 1) {
            return true; // 0 e 1 pertencem à sequência
        }

        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == numero;
    }
}