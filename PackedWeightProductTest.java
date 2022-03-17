import org.junit.Test;

import static org.junit.Assert.*;

public class PackedWeightProductTest {
    PackedWeightProduct product = new PackedWeightProduct(new WeightProduct("Product", "Something product"),
            1000.0, new ProductPackaging("Puck", 10.0));

    @Test
    public void testGetNetWeight() {
        assertEquals(0, Double.compare(1000.0, product.getNetWeight()));
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(0, Double.compare(1010.0, product.getGrossWeight()));
    }
}