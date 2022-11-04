package task4;
import org.example.task4.BrickInHole;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BrickInHoleTest {

    @Test
    public void Test1(){
        assertTrue("Brick with dimentions x = 1, y = 2, z = 10 will go through the hole with dimentions a = 5, b = 3", BrickInHole.isBrickGoThroughHole(5, 3, 1, 2, 10));
    }

    @Test
    public void Test2(){
        assertTrue("Brick with dimentions x = 7, y = 3, z = 3 will go through the hole with dimentions a = 4, b = 4", BrickInHole.isBrickGoThroughHole(4, 4, 7, 3, 3));
    }

    @Test
    public void Test3(){
        assertFalse("Brick with dimentions x = 4, y = 2, z = 10 will go through the hole with dimentions a = 4, b = 4", BrickInHole.isBrickGoThroughHole(4, 4, 4, 2, 10));
    }

}
