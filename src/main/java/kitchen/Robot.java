package kitchen;

import model.Order;
import model.product.Product;

import java.util.LinkedList;
import java.util.Queue;

public class Robot {

    private Queue<Order> orders = new LinkedList<>();


    private Robot() {
        new Thread(this::startProcessing).start();
    }

    public static Robot getInstance() {
        return HOLDER.INSTANCE;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }



    private void startProcessing() {
        while (true) {
            if (!orders.isEmpty()) {
                processOrder();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void processOrder() {
        final Order orderToProcess = orders.poll();
        final Product baseProduct = orderToProcess.getMeal().getFactory().create();
        final Product finalProduct = orderToProcess.getExtra().getExtraDecorator().decorateProduct(baseProduct);
        orderToProcess.prepared(finalProduct);
    }

    private static class HOLDER {
        private static final Robot INSTANCE = new Robot();
    }

}
