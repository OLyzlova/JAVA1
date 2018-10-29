import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public List<Double> getNumbers() {
        List<Double> numbers = new ArrayList<> ();
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        while (numbers.size () < 2) {
            int index = numbers.size () + 1;
            System.out.print ("Введите дробное число " + index + ": ");
            try {
                numbers.add (Double.parseDouble (reader.readLine ()));
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

        return numbers;
    }
}
