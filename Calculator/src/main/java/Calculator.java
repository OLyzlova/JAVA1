import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calculator {
    public void calculator() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        System.out.print ("Введите первое число: ");
        double firstNumber = Double.parseDouble (reader.readLine());

        System.out.print ("Введите второе число: ");
        double secondNumber = Double.parseDouble (reader.readLine());

        System.out.print ("Введите операцию (\"+\", \"-\", \"*\", \"/\"):");
        String operation = reader.readLine ();

        double result;

        if (operation.equals ("+")) {
            result = firstNumber + secondNumber;
            System.out.print ("Результат сложения: ");
        }
        else if (operation.equals ("-")) {
            result = firstNumber - secondNumber;
            System.out.print ("Результат вычитания: ");
        }
        else if (operation.equals ("*")) {
            result = firstNumber * secondNumber;
            System.out.print ("Результат умножения: ");
        }
        else {
            result = firstNumber / secondNumber;
            System.out.print ("Результат деления: ");
        }

        DecimalFormat df = new DecimalFormat ("0.0000");
        System.out.println (df.format (result));
    }
}
