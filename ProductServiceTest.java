import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {

    PackedWeightProduct[] weightProducts = {new PackedWeightProduct(new WeightProduct("Product1", "Something product1"),
            1000.0, new ProductPackaging("Puck", 10.0)),
            new PackedWeightProduct(new WeightProduct("Product2", "Something product2"),
                    1200.0, new ProductPackaging("Puck", 10.0))};
    BatchProduct batch = new BatchProduct("Something butch", weightProducts);

    @Test
    public void testCounter() {
        assertEquals(1, ProductService.countByFilter(batch, new BeginStringFilter("Product1")));
        assertEquals(2, ProductService.countByFilter(batch, new ContainStringFilter("Product")));
        assertEquals(1, ProductService.countByFilter(batch, new EndStringFilter("1")));
    }
}