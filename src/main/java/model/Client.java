package model;

import io.ConsoleInteractionService;
import lombok.Data;
import model.product.Product;

@Data
public class Client {

    private double happiness;

    public void notifyOrderPrepared(Product product) {
        product.executeConsumeActions(this);

        ConsoleInteractionService.getInstance().print(this.toString());
    }

}
