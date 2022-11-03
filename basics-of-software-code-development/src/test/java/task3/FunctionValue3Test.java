package task3;
import org.junit.Test;
import org.myexample.task3.FunctionValue3;

import static org.junit.Assert.assertEquals;

public class FunctionValue3Test {

    @Test
    public void test1(){
        assertEquals("findFunctionValue3(1, 1)", -7.145445549638803, FunctionValue3.findFunctionValue("1","1"), 0.0);
    }

    @Test
    public void test2(){
        assertEquals("findFunctionValue3(10, -10)", 0.5872139151569291, FunctionValue3.findFunctionValue("10","-10"), 0.0);
    }

    @Test
    public void test3(){
        assertEquals("findFunctionValue3(0, 0)", 0, FunctionValue3.findFunctionValue("0","0"), 0.0);
    }
}
