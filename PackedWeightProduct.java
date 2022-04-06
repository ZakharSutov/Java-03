import java.util.Objects;

public class PackedWeightProduct extends PackedProduct {
    private double weight;
    private ProductPackaging productPackaging;
    private WeightProduct weightProduct;

    public PackedWeightProduct(WeightProduct product, double weight, ProductPackaging productPackaging) {
        if (Math.abs(weight - 0) < 1e-9 || weight < 0) throw new IllegalArgumentException("Negative weight!");
        this.weight = weight;
        this.productPackaging = productPackaging;
        this.weightProduct = product;
    }

    public double getNetWeight() {
        return weight;
    }

    public double getGrossWeight() {
        return weight + productPackaging.getWeight();
    }

    public String getName() {
        return weightProduct.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedWeightProduct that = (PackedWeightProduct) o;
        return Double.compare(that.weight, weight) == 0 && productPackaging.equals(that.productPackaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, productPackaging);
    }

    @Override
    public String toString() {
        return "PackedWeightProduct{" +
                "weight=" + weight +
                ", productPackaging=" + productPackaging +
                '}';
    }
}

