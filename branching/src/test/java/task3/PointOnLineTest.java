package task3;
import org.example.task3.PointsOnLine;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PointOnLineTest {

    @Test
    public void Test1(){
        assertTrue("(), () and () lie on a one line", PointsOnLine.isPointsOnLine(1,1,0,0,4,4));
    }

    @Test
    public void Test2(){
        assertTrue("(), () and () lie on a one line", PointsOnLine.isPointsOnLine(-1, 1,1,2, 3,3));
    }

    @Test
    public void Test3(){
        assertFalse("(), () and () lie on a one line", PointsOnLine.isPointsOnLine(-1,-1,1,1,0,4));
    }

    @Test
    public void Test4(){
        assertFalse("(), () and () lie on a one line", PointsOnLine.isPointsOnLine(-1, 1, 1, 2, 0,0));
    }

}
