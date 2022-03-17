import java.util.Objects;

public class ProductPackaging {
    private String name;
    private double weight;

    public ProductPackaging(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean equals(ProductPackaging prodPackaging) {
        if (this == prodPackaging) return true;
        if (prodPackaging == null) return false;
        if (getClass() != prodPackaging.getClass()) return false;

        ProductPackaging that = (ProductPackaging) prodPackaging;
        return Double.compare(that.getWeight(), getWeight()) == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight());
    }

    @Override
    public String toString() {
        return "ProductPackaging{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}