import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PointTest {

        
    @Test
    public void TestExtends(){
        assertTrue(Shape.class.isAssignableFrom(Point.class));
        assertFalse(Point.class.isAssignableFrom(Shape.class));
    }

        @Test
    public void test_prazanKonstruktor() {
        Point test = new Point();
        assertNotEquals(test, null);
    }

    @Test
    public void testDistance() {
        Point test1 = new Point(2, 2);
        double d1=test1.distance(2, 0);
        assertEquals(d1, 2);

    }

    @Test
    public void testContains() {
        Point test1 = new Point(2, 2);
        double d1=test1.distance(2, 0);
        assertTrue(test1.contains(3, 3));

    }

}
