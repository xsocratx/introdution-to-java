package task2;
import org.junit.Test;
import org.myexample.task2.FunctionValue2;

import static org.junit.Assert.assertEquals;

public class FunctinValue2Test {

    @Test
    public void test1() {
        assertEquals("findFunctionValue(1, 1, 1)", 1.618033988749895, FunctionValue2.findFunctionValue("1","1","1"), 0.0);
    }

    @Test
    public void test2() {
        assertEquals("findFunctionValue(1, 1, 1)", -41.153751525134304, FunctionValue2.findFunctionValue("4","5","1"), 0.0);
    }

}
