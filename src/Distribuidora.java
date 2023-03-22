

public class Distribuidora {
    public static void main(String[] args) {
        double totalFaturamento = 0.0;
        double percentualSP, percentualRJ, percentualMG, percentualES, percentualOutros;

        // Definição do faturamento mensal por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Cálculo do valor total mensal da distribuidora
        totalFaturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Cálculo do percentual de representação de cada estado
        percentualSP = (faturamentoSP / totalFaturamento) * 100.0;
        percentualRJ = (faturamentoRJ / totalFaturamento) * 100.0;
        percentualMG = (faturamentoMG / totalFaturamento) * 100.0;
        percentualES = (faturamentoES / totalFaturamento) * 100.0;
        percentualOutros = (faturamentoOutros / totalFaturamento) * 100.0;

        // Impressão dos resultados
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}
