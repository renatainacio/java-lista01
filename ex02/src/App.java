import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da sequência de Fibonacci a ser criada:");
        int size = scanner.nextInt();
        List<Integer> fibonacci = new ArrayList<>();

        for(int i = 0; i < size; i++){
            if (i == 0 || i == 1)
                fibonacci.add(i);
            else
                fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
        }

        for(int i = 0; i < size; i++){
            System.out.print(fibonacci.get(i) + " ");
        }
        System.out.println();

    }
}
