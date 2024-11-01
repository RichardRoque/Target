

import java.util.Scanner;

public class FaturamentoMensalDinamico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o faturamento de SP: R$ ");
        double sp = scanner.nextDouble();

        System.out.print("Digite o faturamento de RJ: R$ ");
        double rj = scanner.nextDouble();

        System.out.print("Digite o faturamento de MG: R$ ");
        double mg = scanner.nextDouble();

        System.out.print("Digite o faturamento de ES: R$ ");
        double es = scanner.nextDouble();

        System.out.print("Digite o faturamento de Outros: R$ ");
        double outros = scanner.nextDouble();
        
        double total = sp + rj + mg + es + outros;

        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        System.out.println("Percentual de representação do faturamento por estado:");
        System.out.println("SP: " + String.format("%.2f", percentualSP) + "%");
        System.out.println("RJ: " + String.format("%.2f", percentualRJ) + "%");
        System.out.println("MG: " + String.format("%.2f", percentualMG) + "%");
        System.out.println("ES: " + String.format("%.2f", percentualES) + "%");
        System.out.println("Outros: " + String.format("%.2f", percentualOutros) + "%");

        scanner.close();
    }
}
