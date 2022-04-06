import org.junit.Test;

import static org.junit.Assert.*;

public class PackedWeightProductTest {
    ProductPackaging productPackaging = new ProductPackaging("Puck", 10.0);
    WeightProduct weightProduct = new WeightProduct("Product", "Something product");
    PackedWeightProduct product = new PackedWeightProduct(weightProduct,
            1000.0, productPackaging);

    @Test
    public void testGetNetWeight() {
        assertEquals(0, Double.compare(1000.0, product.getNetWeight()));
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(0, Double.compare(1010.0, product.getGrossWeight()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNetWeightFalse() {
        PackedWeightProduct product = new PackedWeightProduct(weightProduct,
                -1000.0, productPackaging);

    }
}