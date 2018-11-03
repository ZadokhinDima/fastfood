package kitchen.factory.base;

import model.product.HotDog;
import model.product.Product;

public class HotDogFactory implements MealFactory {

    public Product create() {
        return new HotDog();
    }
}
