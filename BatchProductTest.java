import org.junit.Test;

import static org.junit.Assert.*;

public class BatchProductTest {
    PackedWeightProduct[] weightProducts = {new PackedWeightProduct(new WeightProduct("Product1", "Something product1"),
            1000.0, new ProductPackaging("Puck", 10.0)),
            new PackedWeightProduct(new WeightProduct("Product2", "Something product2"),
            1200.0, new ProductPackaging("Puck", 10.0))};
    BatchProduct productBatch = new BatchProduct("Something butch", weightProducts);

    @Test
    public void testGetWeight() {
        assertEquals(0, Double.compare(2220.0, productBatch.getWeight()));
    }
}