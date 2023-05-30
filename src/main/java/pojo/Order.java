package pojo;

import abstractFactory.AbstractOrderFactory;
import decorator.ISpecialService;
import lombok.Data;
import pojo.orderDetails.OrderContent;
import pojo.orderDetails.OrderFooter;
import pojo.orderDetails.OrderHeader;
@Data
public class Order implements ISpecialService {


    private AbstractOrderFactory orderFactory;
    private Integer orderId;

    private OrderHeader orderHeader;

    private OrderFooter orderFooter;

    private OrderContent orderContent;


    // TODO 被装饰者行为
    @Override
    public Integer getCost() {
        return 0;
    }
}
