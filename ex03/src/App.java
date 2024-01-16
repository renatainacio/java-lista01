import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver sua tabela de multiplicação:");
        int number = scanner.nextInt();
        System.out.println("Tabela de multiplicação por " + number);
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }
}
