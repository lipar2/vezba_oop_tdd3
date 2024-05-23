import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void test_prazanKonstruktor() {
        Point test = new Point();
        assertNotEquals(test, null);
    }

    @Test
    public void KonstruktorTest(){
        Point test = new Point(4,5,true);
        assertEquals(test.getX(), 4);
        assertEquals(test.getY(),5);
        assertEquals(test.isSelected(), true);
    }
}
