import org.junit.Test;

import static org.junit.Assert.*;

public class PackedPieceProductTest {
    ProductPackaging productPackaging = new ProductPackaging("Pack", 10.0);
    PieceProduct pieceProduct = new PieceProduct("Product", "Something product", 200);
    PackedPieceProduct packagedProduct = new PackedPieceProduct(pieceProduct, 10, productPackaging);

    @Test
    public void testGetCount(){
        assertEquals(10, packagedProduct.getCount());
    }

    @Test
    public void testGetNetWeight() {
        assertEquals(0, Double.compare(2000.0, packagedProduct.getNetWeight()));
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(0, Double.compare(2100.0, packagedProduct.getGrossWeight()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNetWeightFail() {
        PackedPieceProduct packagedProduct = new PackedPieceProduct(pieceProduct, -10, productPackaging);
    }
}