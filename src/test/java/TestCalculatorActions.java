import org.junit.Assert;
import org.junit.Test;

/**
 * Created by z003n5tu on 07.04.2018.
 */
public class TestCalculatorActions {
    
    @Test
    public void shouldSumInputs() {
       //Given
        int a = 10;
       int b = 12;
       
       //When
       int result = CalculatorController.sumInputs(a,b);
       
       //Then
        Assert.assertEquals(result,22);
    }

    @Test(expected=NumberFormatException.class) //then
    public void shouldThrowExceptionWhenInvalidInputsGiven() {
        //Given
        String a = "hello";
        int b = 12;

        //When
        int result = CalculatorController.sumInputs(Integer.valueOf(a),b);
    }

    @Test
    public void shouldSubtractInputs() {
        //Given
        int a = 12;
        int b = 10;

        //When
        int result = CalculatorController.subtractInputs(a,b);

        //Then
        Assert.assertEquals(result,2);
    }
    
    
}
