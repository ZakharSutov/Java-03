import java.util.Objects;

public class PackedWeightProduct extends PackedProduct{
    private double weight;
    private WeightProduct weightProduct;

    public PackedWeightProduct(WeightProduct product, double weight, ProductPackaging prodPack) {
        super(product.getName(), product.getDescription(), prodPack);
        if (Double.compare(weight, 0.0) == -1) throw new IllegalArgumentException("Negative weight!");
        this.weight = weight;
        weightProduct = product;
    }

    public double getWeight() {
        return weight;
    }

    public WeightProduct getProduct() {
        return weightProduct;
    }

    public double getNetWeight() {
        return weight;
    }

    public double getGrossWeight() {
        return weight + productPackaging.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackedWeightProduct that = (PackedWeightProduct) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(weightProduct, that.weightProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, weightProduct);
    }

    @Override
    public String toString() {
        return "PackedWeightProduct{" +
                "weight=" + weight +
                ", weightProduct=" + weightProduct +
                '}';
    }
}

