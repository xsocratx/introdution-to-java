package task6;
import org.junit.Test;
import org.myexample.task6.PointInGivenArea;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PointInGivenAreaTest {

    @Test
    public void Test1(){
        assertTrue("(0, 0) is in given area", PointInGivenArea.isPointInGivenAria("0", "0"));
    }

    @Test
    public void Test2(){
        assertTrue("(-2, 4) is in given area", PointInGivenArea.isPointInGivenAria("-2", "4"));
    }

    @Test
    public void Test3(){
        assertFalse("(-4, -4) is'not in given area", PointInGivenArea.isPointInGivenAria("-4", "-4"));
    }

    @Test
    public void Test4(){
        assertFalse("(4, 4) is'not in given area", PointInGivenArea.isPointInGivenAria("4", "4"));
    }
}
