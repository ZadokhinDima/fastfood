package model.product;

import kitchen.factory.base.ChipsFactory;
import kitchen.factory.base.HotDogFactory;
import kitchen.factory.base.MealFactory;

public enum Meal {

    HOT_DOG(new HotDogFactory()), CHIPS(new ChipsFactory());

    private MealFactory factory;

    Meal(final MealFactory factory) {
        this.factory = factory;
    }

    public MealFactory getFactory() {
        return factory;
    }
}
