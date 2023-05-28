package builder.builders;

import builder.orderDetails.Order;
import builder.orderDetails.OrderContent;
import builder.orderDetails.OrderFooter;
import builder.orderDetails.OrderHeader;

public class OrderController {
    public Order construct(OrderBuilder orderBuilder, String name, OrderContent orderContent, OrderFooter orderFooter){
        Order order;
        orderBuilder.buildOrderHeader(name);
        orderBuilder.buildOrderContent(orderContent);
        orderBuilder.buildOrderFooter(orderFooter);
        order = orderBuilder.createOrder();
        return order;
    }
}
