package kitchen.factory.extra;

import model.product.MustardedProduct;
import model.product.Product;

public class MustardDecorator implements ExtraDecorator {

    public Product decorateProduct(final Product baseProduct) {
        return new MustardedProduct(baseProduct);
    }
}
