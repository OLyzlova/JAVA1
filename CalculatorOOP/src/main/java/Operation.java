import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operation {
    public String getOperation () {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("Введите операцию (+, -, *, /): ");
        String operation = null;
        try {
            operation = reader.readLine ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
        return operation;
    }
}
