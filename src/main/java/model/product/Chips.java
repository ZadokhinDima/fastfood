package model.product;

import model.Client;

public class Chips implements Product {

    public void executeConsumeActions(final Client client) {
        double happiness = client.getHappiness();
        happiness *= 1.05;
        client.setHappiness(happiness);
    }
}
