abstract public class PackedProduct extends Product {
    protected ProductPackaging productPackaging;

    public PackedProduct(String name, String description, ProductPackaging productPackaging) {
        super(name, description);
        this.productPackaging = productPackaging;
    }

    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    abstract public double getNetWeight();

    abstract public double getGrossWeight();
}

