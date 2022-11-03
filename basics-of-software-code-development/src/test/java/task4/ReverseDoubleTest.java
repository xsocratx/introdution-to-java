package task4;
import org.junit.Test;
import org.myexample.task4.ReverseDouble;

import static org.junit.Assert.assertEquals;

public class ReverseDoubleTest {

    @Test
    public void test1(){
        assertEquals("123.321 is 321.123", 321.123, ReverseDouble.getReverseDouble("123.321"),0.0);
    }

    @Test
    public void test2(){
        assertEquals("913.693 is 693.913", 693.913, ReverseDouble.getReverseDouble("913.693"),0.0);
    }

    @Test
    public void test3(){
        assertEquals("777.555 is 555.777", 555.777, ReverseDouble.getReverseDouble("777.555"),0.0);
    }

}
