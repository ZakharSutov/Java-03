import org.junit.Test;

import static org.junit.Assert.*;

public class BatchProductTest {
    WeightProduct weightProduct1 = new WeightProduct("Product1", "Something product1");
    WeightProduct weightProduct2 = new WeightProduct("Product2", "Something product2");
    ProductPackaging productPackaging1 = new ProductPackaging("Puck", 10.0);
    ProductPackaging productPackaging2 = new ProductPackaging("Puck", 10.0);
    PackedWeightProduct[] weightProducts = {new PackedWeightProduct(weightProduct1, 1000.0, productPackaging1),
            new PackedWeightProduct(weightProduct2, 1200.0, productPackaging2)};
    BatchProduct productBatch = new BatchProduct("Something butch", weightProducts);

    @Test
    public void testGetWeight() {
        assertEquals(2220, productBatch.getWeight(), 0.0001);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Something butch", productBatch.getDescription());
    }
}