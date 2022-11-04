package task1;
import org.example.task1.TriangleExistence;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleExistenceTest {

    @Test
    public void Test1(){
        assertEquals("Triangle with angles 60 and 35 exists", "Triangle exists", TriangleExistence.isTriangleExist("60", "35"));
    }

    @Test
    public void Test2(){
        assertEquals("Triangle with angles 40 and 40 exists", "Triangle exists", TriangleExistence.isTriangleExist("40", "40"));
    }

    @Test
    public void Test3(){
        assertEquals("Triangle with angles 45 and 45 exists", "Triangle exists and is a Right Triangle", TriangleExistence.isTriangleExist("45", "45"));
    }

    @Test
    public void Test4(){
        assertEquals("Triangle with angles 55 and 35 exists", "Triangle exists and is a Right Triangle", TriangleExistence.isTriangleExist("35", "55"));
    }

    @Test
    public void Test5(){
        assertEquals("Triangle with angles 90 and 90 doesn't exist", "Triangle doesn't exist", TriangleExistence.isTriangleExist("90", "90"));
    }

    @Test
    public void Test6(){
        assertEquals("Triangle with angles 90 and 100 doesn't exist", "Triangle doesn't exist", TriangleExistence.isTriangleExist("90", "100"));
    }
}
