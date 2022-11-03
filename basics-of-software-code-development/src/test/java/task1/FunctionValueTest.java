package task1;
import org.junit.Test;
import org.myexample.task1.FunctionValue;

import static org.junit.Assert.assertEquals;

public class FunctionValueTest {
    @Test
    public void test1(){
        assertEquals( "findFunctionValue(1, 2, 3)",1.0, FunctionValue.findFunctionValue("1", "2", "3"), 0.0);
    }
    @Test
    public void test2(){
        assertEquals("findFunctionValue(3, 2, 1)", 1.0, FunctionValue.findFunctionValue("3", "2", "1"), 0.0);
    }
    @Test
    public void test3(){
        assertEquals("findFunctionValue(3, 3, 3)", 3.0, FunctionValue.findFunctionValue("3", "3", "3"), 0.0);
    }
    @Test
    public void test4(){
        assertEquals("findFunctionValue(0, 0, 0)", 0.0, FunctionValue.findFunctionValue("0", "0", "0"), 0.0);
    }

}
