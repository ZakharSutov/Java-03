import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {
    WeightProduct weightProduct1 = new WeightProduct("Product1", "Something product1");
    WeightProduct weightProduct2 = new WeightProduct("Product2", "Something product2");
    ProductPackaging productPackaging1 = new ProductPackaging("Puck", 10.0);
    ProductPackaging productPackaging2 = new ProductPackaging("Puck", 10.0);
    PackedWeightProduct[] weightProducts = {new PackedWeightProduct(weightProduct1, 1000.0, productPackaging1),
            new PackedWeightProduct(weightProduct2, 1200.0, productPackaging2)};
    BatchProduct batch = new BatchProduct("Something butch", weightProducts);
    @Test
    public void testCounter() {
        assertEquals(1, ProductService.countByFilter(batch, new BeginStringFilter("Product1")));
        assertEquals(2, ProductService.countByFilter(batch, new ContainStringFilter("duct")));
        assertEquals(1, ProductService.countByFilter(batch, new EndStringFilter("1")));
    }
}