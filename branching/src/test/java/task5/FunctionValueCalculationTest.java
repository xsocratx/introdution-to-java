package task5;
import org.example.task5.FunctionValueCalculation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FunctionValueCalculationTest {

    @Test
    public void Test1(){
        assertEquals("calculateFunctionValue(4)", 0.014285714285714285, FunctionValueCalculation.calculateFunctionValue("4"), 0);
    }

    @Test
    public void Test2(){
        assertEquals("calculateFunctionValue(0)", 9, FunctionValueCalculation.calculateFunctionValue("0"), 0);
    }

    @Test
    public void Test3(){
        assertEquals("calculateFunctionValue(-4)", 37, FunctionValueCalculation.calculateFunctionValue("-4"), 0);
    }

}
