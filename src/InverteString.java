import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();

        String invertida = inverterString(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String original) {
        char[] chars = original.toCharArray();
        int inicio = 0;
        int fim = chars.length - 1;

        while (inicio < fim) {
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(chars);
    }
}


