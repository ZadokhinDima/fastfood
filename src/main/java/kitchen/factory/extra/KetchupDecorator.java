package kitchen.factory.extra;

import model.product.KetchupedProduct;
import model.product.Product;

public class KetchupDecorator implements ExtraDecorator {

    public Product decorateProduct(final Product baseProduct) {
        return new KetchupedProduct(baseProduct);
    }
}
