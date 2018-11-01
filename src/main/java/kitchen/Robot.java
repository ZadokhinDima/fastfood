package kitchen;

import model.Order;

import java.util.Queue;

public class Robot {

    private Queue<Order> orders;

    public void startProcessing() {

    }

    private void processOrder() {
        final Order orderToProcess = orders.poll();

    }

}
