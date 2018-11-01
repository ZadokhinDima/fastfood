package model.product;

import model.Client;

public class KetchupedProduct implements Product {

    private Product product;

    public void executeConsumeActions(final Client client) {
        product.executeConsumeActions(client);
        product.executeConsumeActions(client);
    }
}
