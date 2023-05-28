package builder;

import builder.builders.AirParcelBuilder;
import builder.builders.OrderBuilder;
import builder.builders.OrderController;
import builder.orderDetails.Order;
import builder.orderDetails.OrderContent;
import builder.orderDetails.OrderFooter;

public class OrderGenerator {
    static int i;//决定用哪个建造者

    static OrderBuilder orderBuilder = new AirParcelBuilder();
    static OrderContent content =new OrderContent();
    static OrderFooter footer =new OrderFooter();
    static OrderController controller = new OrderController();

    public OrderGenerator(int i) {
        this.i = i;
    }

    public Order newOrder(String departure, String destination, String time, String payerName) {
        content.setDeparture(departure);
        content.setDestination(destination);
        content.setTime(time);
        footer.setPayerName(payerName);
        if (i == 0){//用Air
            Order order=controller.construct(orderBuilder,"AIRPARCEL",content,footer);;
            return order;
        }else {
            Order order=controller.construct(orderBuilder,"LANDPARCEL",content,footer);;
            return  order;
        }
    }
}
