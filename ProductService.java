import java.util.Arrays;

public class ProductService {
    public static int countByFilter(BatchProduct batch, Filter strFilter) {
        int count = 0;
        for (PackedProduct product: batch.getProducts()) {
            if (strFilter.apply(product.getName())) {
                count++;
            }
        }
        return  count;
    }
}