import java.util.Objects;

public class Product {
    private  String name;
    private  String description;

    public Product(String name, String description) {
        if (name == null || description == null) throw new IllegalArgumentException();
        this.name = name;
        this.description = description;
    }

    public Product(Product product) {
        this.name = product.getName();
        this.description = product.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
