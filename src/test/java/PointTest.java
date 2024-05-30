import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PointTest {

        @Test
    public void test_prazanKonstruktor() {
        Point test = new Point();
        assertNotEquals(test, null);
    }


}
