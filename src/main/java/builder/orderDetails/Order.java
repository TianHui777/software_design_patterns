package builder.orderDetails;

import abstractFactory.AbstractOrderFactory;
import decorator.ISpecialService;
import lombok.Data;

@Data
public class Order implements ISpecialService {

    private AbstractOrderFactory factory;
    private Integer orderId;

    private OrderHeader orderHeader;

    private OrderFooter orderFooter;

    private OrderContent orderContent;

    public Order(AbstractOrderFactory factory) {
        this.factory=factory;
        orderId=null;
        orderContent=factory.generateOrderContent();
        orderFooter=factory.generateOrderFooter();
        orderHeader=factory.generateOrderHeader();
    }

    @Override
    public Integer getCost() {
        return 50;//»ù±¾¼Û
    }
}
