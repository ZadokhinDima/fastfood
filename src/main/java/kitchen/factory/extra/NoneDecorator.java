package kitchen.factory.extra;

import model.product.Product;

public class NoneDecorator implements ExtraDecorator {

    public Product decorateProduct(final Product baseProduct) {
        return baseProduct;
    }
}
