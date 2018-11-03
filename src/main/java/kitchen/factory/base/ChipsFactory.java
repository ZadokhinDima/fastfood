package kitchen.factory.base;

import model.product.Chips;
import model.product.Product;

public class ChipsFactory implements MealFactory {

    public Product create() {
        return new Chips();
    }
}
