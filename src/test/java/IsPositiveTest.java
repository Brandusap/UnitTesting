import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {
   @Test
    public void checkIsPositiveTrue(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(3.5);
        Assertions.assertTrue(result, "Ai dat-o in bara.");
    }
    @Disabled
    @Test
    public void checkIsPositiveFalse(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-3.5);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.5,4.6,8.9,Double.MAX_VALUE})
    public void checkPositiveParameterized(double numberFromValue){
       IsPositive numberToCheck =  new IsPositive();
       boolean result = numberToCheck.isPositive(numberFromValue);
       Assertions.assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(doubles = {-2.5,-6.0,-6, -Double.MAX_VALUE})
    public void checkNegativeValues(double numberFromList){
        IsPositive numberToCheck =  new IsPositive();
        boolean result = numberToCheck.isNegative(numberFromList);
        Assertions.assertTrue(result);
    }


}
