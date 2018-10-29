import java.text.DecimalFormat;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Numbers nm = new Numbers ();
        List<Double> numbers =  nm.getNumbers ();

        Operation opr = new Operation ();
        String operation = opr.getOperation ();

        double result = getResult (numbers, operation);

        printResult (result);
    }

    public static double getResult(List<Double> numbers, String operation) {
        Calculator calculator = new Calculator ();
        double result = 0.0;

        if (operation.equals ("+"))
            result = calculator.countSum (numbers);
        if (operation.equals ("-"))
            result = calculator.subtract (numbers);
        if (operation.equals ("*"))
            result = calculator.multiply (numbers);
        if (operation.equals ("/")) {
            try {
                result = calculator.devide (numbers);
            } catch (Exception e) {
                System.out.println ("Деление на \"0\"!");
                e.printStackTrace ();
            }
        }

        return result;
    }

    private static void printResult(double result) {
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println ("Результат операции: " + df.format (result));
    }
}