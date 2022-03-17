import org.junit.Test;

import static org.junit.Assert.*;

public class BeginStringFilterTest {
    BeginStringFilter filter = new BeginStringFilter("Test");

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("Test method"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Bad test method"));
        assertFalse(filter.apply("test method"));
    }
}