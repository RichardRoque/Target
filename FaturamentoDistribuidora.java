import java.util.ArrayList;
import java.util.List;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {

        List<DiaFaturamento> diasFaturamento = new ArrayList<>();
        diasFaturamento.add(new DiaFaturamento(1, 22174.1664));
        diasFaturamento.add(new DiaFaturamento(2, 24537.6698));
        diasFaturamento.add(new DiaFaturamento(3, 26139.6134));
        diasFaturamento.add(new DiaFaturamento(4, 0.0));
        diasFaturamento.add(new DiaFaturamento(5, 0.0));
        diasFaturamento.add(new DiaFaturamento(6, 26742.6612));
        diasFaturamento.add(new DiaFaturamento(7, 0.0));
        diasFaturamento.add(new DiaFaturamento(8, 42889.2258));
        diasFaturamento.add(new DiaFaturamento(9, 46251.174));
        diasFaturamento.add(new DiaFaturamento(10, 11191.4722));
        diasFaturamento.add(new DiaFaturamento(11, 0.0));
        diasFaturamento.add(new DiaFaturamento(12, 0.0));
        diasFaturamento.add(new DiaFaturamento(13, 3847.4823));
        diasFaturamento.add(new DiaFaturamento(14, 373.7838));
        diasFaturamento.add(new DiaFaturamento(15, 2659.7563));
        diasFaturamento.add(new DiaFaturamento(16, 48924.2448));
        diasFaturamento.add(new DiaFaturamento(17, 18419.2614));
        diasFaturamento.add(new DiaFaturamento(18, 0.0));
        diasFaturamento.add(new DiaFaturamento(19, 0.0));
        diasFaturamento.add(new DiaFaturamento(20, 35240.1826));
        diasFaturamento.add(new DiaFaturamento(21, 43829.1667));
        diasFaturamento.add(new DiaFaturamento(22, 18235.6852));
        diasFaturamento.add(new DiaFaturamento(23, 4355.0662));
        diasFaturamento.add(new DiaFaturamento(24, 13327.1025));
        diasFaturamento.add(new DiaFaturamento(25, 0.0));
        diasFaturamento.add(new DiaFaturamento(26, 0.0));
        diasFaturamento.add(new DiaFaturamento(27, 25681.8318));
        diasFaturamento.add(new DiaFaturamento(28, 1718.1221));
        diasFaturamento.add(new DiaFaturamento(29, 13220.495));
        diasFaturamento.add(new DiaFaturamento(30, 8414.61));

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        int diasAcimaMedia = 0;

        for (DiaFaturamento dia : diasFaturamento) {
            double valor = dia.getValor();

            if (valor > 0) {
                
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;

        for (DiaFaturamento dia : diasFaturamento) {
            double valor = dia.getValor();

            if (valor > 0 && valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }
}

class DiaFaturamento {
    private int dia;
    private double valor;

    public DiaFaturamento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public double getValor() {
        return valor;
    }
}