import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;
    @Test
    public void checkSum(){
        double result = calculator.sum(4.5,2.3);
        Assertions.assertEquals(6.8, result, "Rezultat incorect");
    }
    @Test
    public void checkMultiply(){
        double result = calculator.multiply(4.5,2.3);
        Assertions.assertEquals(10.35, result, "Rezultat incorect");
    }
    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach is executed");
        calculator = new Calculator();
    }
    @Test
    public void checkDivide(){
        double result = calculator.divide(5,2.5);
        Assertions.assertEquals(2, result, "Rezultat incorect");
    }
    @Test
    public void checkModulo(){
        double result = calculator.modulo(10,2);
        Assertions.assertEquals(0, result, "Rezultat incorect");
    }

    @Test
    public void checkSubtract(){
        double result = calculator.subtract(4.5,2.5);
        Assertions.assertEquals(2, result, "Rezultat incorect");
    }


}
