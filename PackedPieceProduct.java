import java.util.Objects;

public class PackedPieceProduct extends PackedProduct{
    private PieceProduct product;
    private int count;

    public PackedPieceProduct(PieceProduct product, int count, ProductPackaging productPackaging) {
        super(product.getName(), product.getDescription(), productPackaging);
        if (count < 0) throw new IllegalArgumentException("Negative count!");
        this.count = count;
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public ProductPackaging getProduct() {
        return productPackaging;
    }

    public double getNetWeight() {
        return count * product.getWeight();
    }

    public double getGrossWeight() {
        return count * (product.getWeight() + productPackaging.getWeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedPieceProduct that = (PackedPieceProduct) o;
        return count == that.count && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), product, count);
    }

    @Override
    public String toString() {
        return "PackedPieceProduct{" +
                "product=" + product +
                ", count=" + count +
                '}';
    }
}