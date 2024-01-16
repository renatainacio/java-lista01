import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho da pirâmide:");
        int size = scanner.nextInt();
        System.out.println();
        System.out.println("Pirâmide de " + size);
        for(int i = 1; i <= size; i++){
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
