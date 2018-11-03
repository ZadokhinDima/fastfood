package model.product;

import model.Client;

public class MustardedProduct implements Product {

    private Product baseProduct;

    public MustardedProduct(final Product baseProduct) {
        this.baseProduct = baseProduct;
    }

    public void executeConsumeActions(final Client client) {
        double happiness = client.getHappiness();
        happiness += 1;
        client.setHappiness(happiness);
    }
}
