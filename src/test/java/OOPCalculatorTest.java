import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OOPCalculatorTest {


    OOPCalculator calculator = new OOPCalculator();


    @Test
    public void calculateAddititionTest() throws DivisionByZeroException {
        calculator.setX1(3);
        calculator.setX2(0.22222);
        calculator.setSymbol("+");
        Assert.assertEquals (3.2222, calculator.calculate(), 0.0001);
    }

    @Test
    public void calculateExtractionTest() throws DivisionByZeroException {
        calculator.setX1(3.45);
        calculator.setX2(10);
        calculator.setSymbol("-");
        Assert.assertEquals(-6.55, calculator.calculate(), 0.0001);
    }

    @Test
    public void calculateMultiplicationTest() throws DivisionByZeroException {
        calculator.setX1(3);
        calculator.setX2(0.22222);
        calculator.setSymbol("*");
        Assert.assertEquals (0.6666, calculator.calculate(), 0.0001);
    }

    @Test
    public void calculateDivisionTest() throws DivisionByZeroException {
        calculator.setX1(3);
        calculator.setX2(0.22222);
        calculator.setSymbol("/");
        Assert.assertEquals (13.50, calculator.calculate(), 0.0001);
    }

    @Test (expected = DivisionByZeroException.class)
    public void calculateDivisionByZeroTest() throws DivisionByZeroException {
        calculator.setX1(3);
        calculator.setX2(0);
        calculator.setSymbol("/");
        calculator.calculate();
    }




}