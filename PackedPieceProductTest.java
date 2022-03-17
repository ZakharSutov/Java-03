import org.junit.Test;

import static org.junit.Assert.*;

public class PackedPieceProductTest {
    PackedPieceProduct packagedProduct = new PackedPieceProduct(new PieceProduct("Product", "Something product", 200.00),
            10, new ProductPackaging("Pack", 10.0));

    @Test
    public void testGetNetWeight() {
        assertEquals(0, Double.compare(2000.0, packagedProduct.getNetWeight()));
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(0, Double.compare(2100.0, packagedProduct.getGrossWeight()));
    }
}