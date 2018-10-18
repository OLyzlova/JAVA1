import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchMax {
    public void search() throws IOException {
        System.out.print ("Введите размер массива: ");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        int size = Integer.parseInt (reader.readLine ());

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print ("Введите элемент массива №" + i + ": ");
            array[i] = reader.readLine ();
        }

        String max = "";

        for (int i = 0; i < size; i++) {
            if (array[i].length () > max.length ())
                max = array[i];
        }

        System.out.println ("Самое длинное слово в массиве: \"" + max + "\"");
    }
}
