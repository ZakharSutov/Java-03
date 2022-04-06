import java.util.Objects;

public class PackedPieceProduct extends PackedProduct {
    private int count;
    private ProductPackaging productPackaging;
    private PieceProduct pieceProduct;

    public PackedPieceProduct(PieceProduct product, int count, ProductPackaging productPackaging) {
        if (count < 0) throw new IllegalArgumentException("Negative count!");
        this.count = count;
        this.productPackaging = productPackaging;
        this.pieceProduct = product;
    }

    public int getCount() {
        return count;
    }

    public double getNetWeight() {
        return count * pieceProduct.getWeight();
    }

    public double getGrossWeight() {
        return count * (pieceProduct.getWeight() + productPackaging.getWeight());
    }

    public String getName() {
        return pieceProduct.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedPieceProduct that = (PackedPieceProduct) o;
        return count == that.count && productPackaging.equals(that.productPackaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), count, productPackaging);
    }

    @Override
    public String toString() {
        return "PackedPieceProduct{" +
                "count=" + count +
                ", productPackaging=" + productPackaging +
                '}';
    }
}