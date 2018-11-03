package client;

import io.ConsoleInteractionService;
import kitchen.Robot;
import model.Client;
import model.Order;
import model.product.Extra;
import model.product.Meal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        ConsoleInteractionService ioService = ConsoleInteractionService.getInstance();

        ioService.print("WELCOME TO RESTAURANT");

        Robot robot = Robot.getInstance();
        Client client = new Client();
        while(true) {
            final Optional<Order> order = placeOrder();
            order.ifPresent(robot::placeOrder);
            if (order.isPresent()) {
                final Order newOrder = order.get();
                newOrder.setClient(client);
            } else {
                break;
            }
        }
    }

    private static Optional<Order> placeOrder() {
        final Order.OrderBuilder orderBuilder = Order.builder();
        ConsoleInteractionService.getInstance().print("Please choose meal:");
        final Meal meal = (Meal) askForChoice(Arrays.asList(Meal.values()));
        orderBuilder.meal(meal);
        final Extra extra = (Extra) askForChoice(Arrays.asList(Extra.values()));
        orderBuilder.extra(extra);
        return Optional.of(orderBuilder.build());
    }

    private static Object askForChoice(List<Object> variants) {
        for (int i = 0; i < variants.size(); i++) {
            ConsoleInteractionService.getInstance().print((i + 1) + ". " + variants.get(i));
        }
        final String input = ConsoleInteractionService.getInstance().read();
        return variants.get(Integer.parseInt(input) - 1);
    }


}
