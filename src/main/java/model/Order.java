package model;

import lombok.Data;
import model.product.Extra;
import model.product.Meal;

@Data
public class Order {

    private Meal meal;
    private Extra extra;
    private Client client;


}
