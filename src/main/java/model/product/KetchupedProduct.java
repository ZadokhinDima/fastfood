package model.product;

import model.Client;

public class KetchupedProduct implements Product {

    private Product product;

    public KetchupedProduct(final Product product) {
        this.product = product;
    }

    public void executeConsumeActions(final Client client) {
        product.executeConsumeActions(client);
        product.executeConsumeActions(client);
    }
}
