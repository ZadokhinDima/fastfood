package model;

import lombok.Builder;
import lombok.Data;
import model.product.Extra;
import model.product.Meal;
import model.product.Product;

@Data
@Builder
public class Order {

    private Meal meal;
    private Extra extra;
    private Client client;

    public void prepared(Product product) {
        client.notifyOrderPrepared(product);
    }


}
