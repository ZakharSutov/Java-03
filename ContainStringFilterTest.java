import org.junit.Test;

import static org.junit.Assert.*;

public class ContainStringFilterTest {
    ContainStringFilter filter = new ContainStringFilter("test");

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("Again test method"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("nothing"));
    }
}