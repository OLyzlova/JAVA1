import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void getResult() {
        List<Double> numbers = Numbers ();
        double expectedSum = 0.006;
        double expectedSubtr = -0.002;
        double expectedMult = 0.000008;
        double expectedDev = 0.5;

        double actualSum = App.getResult (numbers, "+");
        double actualSubtr = App.getResult (numbers, "-");
        double actualMult = App.getResult (numbers, "*");
        double actualDev = App.getResult (numbers, "/");

        Assert.assertEquals (expectedSum, actualSum, 0.001);
        Assert.assertEquals (expectedSubtr, actualSubtr, 0.001);
        Assert.assertEquals (expectedMult, actualMult, 0.000001);
        Assert.assertEquals (expectedDev, actualDev, 0.001);
    }

    private List<Double> Numbers() {
        List<Double> numbers = new ArrayList<> ();
        numbers.add (0.002);
        numbers.add (0.004);
        return numbers;
    }


}