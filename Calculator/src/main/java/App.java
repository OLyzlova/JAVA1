import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println ("Для работы с калькулятором введите \"1\".");
        System.out.println ("Для поиска максимального элемента в массиве1 введите \"2\".");

        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        String mode = reader.readLine ();

        if (mode.equals ("1")) {
            Calculator calc = new Calculator();
            calc.calculator();
        }
        else if (mode.equals ("2")) {
            SearchMax sm = new SearchMax();
            sm.search();
        }
        else System.out.println ("Неверно выбран режим");
    }
}
