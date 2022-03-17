import org.junit.Test;

import static org.junit.Assert.*;

public class EndStringFilterTest {
    EndStringFilter filter = new EndStringFilter("method");

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("Test method"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Method test"));
        assertFalse(filter.apply("Test Method"));
    }
}