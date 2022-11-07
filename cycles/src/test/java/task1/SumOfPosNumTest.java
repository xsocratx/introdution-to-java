package task1;
import org.example.task1.SumOfPosNum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfPosNumTest {

    @Test
    public void Test1(){
        assertEquals("getSumNum(1)", 1, SumOfPosNum.getSumNum("1"));
    }

    @Test
    public void Test2(){
        assertEquals("getSumNum(3)", 6, SumOfPosNum.getSumNum("3"));
    }

    @Test
    public void Test4(){
        assertEquals("getSumNum(2)", 3, SumOfPosNum.getSumNum("2"));
    }
}
