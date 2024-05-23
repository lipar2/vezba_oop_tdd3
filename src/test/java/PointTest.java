import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void testGET() {
        Point test1 = new Point(5, 7);
        assertEquals(test1.getX(), 5);
        assertEquals(test1.getY(), 7);

    
}}
