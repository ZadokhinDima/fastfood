package model.product;

import model.Client;

public class HotDog implements Product {

    public void executeConsumeActions(final Client client) {
        double happiness = client.getHappiness();
        happiness += 2;
        client.setHappiness(happiness);
    }
}
