public class Faturamento {
    public static void main(String[] args) {
        double[] faturamentoDiario = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};

        // menor valor de faturamento
        double menorFaturamento = faturamentoDiario[0];
        for (double valor : faturamentoDiario) {
            if (valor < menorFaturamento) {
                menorFaturamento = valor;
            }
        }
        System.out.println("Menor faturamento diário: " + menorFaturamento);

        // maior valor de faturamento
        double maiorFaturamento = faturamentoDiario[0];
        for (double valor : faturamentoDiario) {
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }
        }
        System.out.println("Maior faturamento diário: " + maiorFaturamento);

        // média mensal de faturamento
        double mediaMensal = 0;
        for (double valor : faturamentoDiario) {
            mediaMensal += valor;
        }
        mediaMensal /= faturamentoDiario.length;

        // número de dias com faturamento acima da média mensal
        int diasAcimaMedia = 0;
        for (double valor : faturamentoDiario) {
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaMedia);
    }
}

