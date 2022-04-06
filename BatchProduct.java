import java.util.Arrays;
import java.util.Objects;

public class BatchProduct {
    private  String description;
    PackedProduct[] products;

    public BatchProduct(String description, PackedProduct[] products) {
        if (description == null) throw new IllegalArgumentException();
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public PackedProduct[] getProducts() {
        return products;
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < products.length; i++){
            weight += products[i].getGrossWeight();
        }
        return weight;
    }
}