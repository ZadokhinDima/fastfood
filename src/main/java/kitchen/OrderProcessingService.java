package kitchen;

import model.Order;

import java.util.Queue;

public class OrderProcessingService {

    private Queue<Order> orders;

    public void placeOrder(Order order) {
        orders.add(order);
    }


}
