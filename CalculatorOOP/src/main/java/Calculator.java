import java.util.List;

public class Calculator {
    public double countSum (List<Double> numbers) {
        return numbers.get (0) + numbers.get (1);
    }

    public double subtract (List<Double> numbers) {
        return numbers.get (0) - numbers.get (1);
    }

    public double multiply (List<Double> numbers) {
        return numbers.get (0) * numbers.get (1);
    }

    public double devide (List<Double> numbers) throws Exception {
        if (numbers.get (1) == 0)
            throw new Exception ();

        return numbers.get (0) / numbers.get (1);
    }
}
