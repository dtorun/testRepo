import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;

/**
 * Created by z003n5tu on 07.04.2018.
 */
public class CalculatorController {
    
    public static int sumInputs(int x, int y) {
        return addExact(x, y);
    }
    
    public static int subtractInputs (int x, int y) {
        return subtractExact(x, y);
    }
}
