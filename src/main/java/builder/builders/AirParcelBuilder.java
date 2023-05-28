package builder.builders;

import builder.orderDetails.OrderContent;
import builder.orderDetails.OrderFooter;
import builder.orderDetails.OrderHeader;

public class AirParcelBuilder extends OrderBuilder {

    @Override
    public void buildOrderHeader(String name) {
        OrderHeader header = new OrderHeader();
        header.setOrderName(name);
        order.setOrderHeader(header);
    }

    @Override
    public void buildOrderContent(OrderContent orderContent) {
        order.setOrderContent(orderContent);
    }

    @Override
    public void buildOrderFooter(OrderFooter orderFooter) {
        order.setOrderFooter(orderFooter);
    }
}
