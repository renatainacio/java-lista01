import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;
        String evenOrOdd = "par";
        String positiveOrNegative = "positivo";

        System.out.println("Digite um número:");
        number = scanner.nextInt();
        scanner.close();
        if(number % 2 != 0)
            evenOrOdd = "ímpar";
        if (number < 0)
            positiveOrNegative = "negativo";
        System.out.println(number + " é " + evenOrOdd + " e " + positiveOrNegative + ".");
    }
}
