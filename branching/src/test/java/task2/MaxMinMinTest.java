package task2;
import org.example.task2.MaxMinMin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxMinMinTest {

    @Test
    public void Test1(){
        assertEquals("max{min(1, 2), min(3, 4)}", 3,
                MaxMinMin.getMaxValue(MaxMinMin.getMinValue("1", "2"), MaxMinMin.getMinValue("3", "4")));
    }

    @Test
    public void Test2(){
        assertEquals("max{min(1, 0), min(3, 4)}", 3,
                MaxMinMin.getMaxValue(MaxMinMin.getMinValue("1", "0"), MaxMinMin.getMinValue("3", "4")));
    }

    @Test
    public void Test3(){
        assertEquals("max{min(1, 1), min(1, 1)}", 1,
                MaxMinMin.getMaxValue(MaxMinMin.getMinValue("1", "1"), MaxMinMin.getMinValue("1", "1")));
    }

    @Test
    public void Test4(){
        assertEquals("max{min(-10, 20), min(30, -4)}", -4,
                MaxMinMin.getMaxValue(MaxMinMin.getMinValue("-10", "20"), MaxMinMin.getMinValue("30", "-4")));
    }


}
