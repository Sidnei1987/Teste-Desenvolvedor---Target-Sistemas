import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        int primeiro = 0;
        int segundo = 1;
        int proximo;
        boolean pertence = false;
        while (segundo <= num) {
            if (segundo == num) {
                pertence = true;
                break;
            }
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
