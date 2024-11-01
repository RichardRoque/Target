public class SomaIndice {

    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        // Enquanto K for menor que INDICE
        while (K < INDICE) {
            // Incrementa K
            K = K + 1;
            // Soma K à variável SOMA
            SOMA = SOMA + K;
        }

        // Imprime o valor final de SOMA
        System.out.println("SOMA: " + SOMA);
    }
}