package task5;
import org.junit.Test;
import org.myexample.task5.ConvertorStoHMS;

import static org.junit.Assert.assertEquals;

public class ConvertorStoHMSTest {

    @Test
    public void Test1(){
        assertEquals("5657S is 1HH 34MM 17SS", "1HH 34MM 17SS", ConvertorStoHMS.getHMSfromS("5657"));
    }

    @Test
    public void Test2(){
        assertEquals("23141235 is 6428HH 7MM 15SS", "6428HH 7MM 15SS", ConvertorStoHMS.getHMSfromS("23141235"));
    }

    @Test
    public void Test3(){
        assertEquals("213 is 0HH 3MM 33SS", "0HH 3MM 33SS", ConvertorStoHMS.getHMSfromS("213"));
    }
}
