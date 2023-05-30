package builder.builders;

import builder.orderDetails.Order;
import builder.orderDetails.OrderContent;
import builder.orderDetails.OrderFooter;
import builder.orderDetails.OrderHeader;

public abstract class OrderBuilder {
    Order order =new Order(null);

    public abstract void buildOrderHeader(String name);
    public abstract void buildOrderContent(OrderContent orderContent);
    public abstract void buildOrderFooter(OrderFooter orderFooter);

    public Order createOrder(){return order;}

}
