package model.product;

import kitchen.factory.extra.ExtraDecorator;
import kitchen.factory.extra.KetchupDecorator;
import kitchen.factory.extra.MustardDecorator;
import kitchen.factory.extra.NoneDecorator;

public enum Extra {

    KETCHUP(new KetchupDecorator()), MUSTARD(new MustardDecorator()), NONE(new NoneDecorator());

    private ExtraDecorator extraDecorator;

    Extra(final ExtraDecorator extraDecorator) {
        this.extraDecorator = extraDecorator;
    }

    public ExtraDecorator getExtraDecorator() {
        return extraDecorator;
    }
}
