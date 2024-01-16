import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> arrayOne = Arrays.asList("Morango", "Banana", "Maçã", "Uva", "Caqui");

        List<String> arrayTwo = Arrays.asList("Manga", "Caqui", "Morango", "Amora");

        for (String element : arrayOne) {
            if (arrayTwo.contains(element))
                System.out.println(element);
        }
    }
}
