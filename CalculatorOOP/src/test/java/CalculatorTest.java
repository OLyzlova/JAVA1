import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void countSum() {
        List<Double> numbers = new ArrayList<> ();
        numbers.add (0.002);
        numbers.add (0.004);

        double expected = 0.006;

        Calculator calc = new Calculator ();
        double actual = calc.countSum (numbers);

        Assert.assertEquals (expected, actual, 0.0001);
    }

    @Test
    public void subtract() {
        List<Double> numbers = new ArrayList<> ();
        numbers.add (0.002);
        numbers.add (0.004);

        double expected = -0.002;

        Calculator calc = new Calculator ();
        double actual = calc.subtract (numbers);

        Assert.assertEquals (expected, actual, 0.0001);
    }

    @Test
    public void multiply() {
        List<Double> numbers = new ArrayList<> ();
        numbers.add (0.2);
        numbers.add (0.4);

        double expected = 0.08;

        Calculator calc = new Calculator ();
        double actual = calc.multiply (numbers);

        Assert.assertEquals (expected, actual, 0.0001);
    }

    @Test
    public void devide() throws Exception {
        List<Double> numbers = new ArrayList<> ();
        numbers.add (0.08);
        numbers.add (0.04);

        double expected = 2.0;

        Calculator calc = new Calculator ();
        double actual = calc.devide (numbers);

        Assert.assertEquals (expected, actual, 0.0001);
    }
}