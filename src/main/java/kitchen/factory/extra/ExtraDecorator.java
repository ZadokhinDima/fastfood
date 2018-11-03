package kitchen.factory.extra;

import model.product.Product;

public interface ExtraDecorator {

    Product decorateProduct(Product baseProduct);

}
