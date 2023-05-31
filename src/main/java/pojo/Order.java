package pojo;

import abstractFactory.AbstractOrderFactory;
import decorator.ISpecialService;
import lombok.Data;
import pojo.orderDetails.OrderContent;
import pojo.orderDetails.OrderFooter;
import pojo.orderDetails.OrderHeader;

import java.util.Date;

@Data
public class Order implements ISpecialService {

    private Integer orderId;
    private String destination;
    private String departure;
    private Date time;
    private String orderName;
    private String payerName;
    private Integer cost;
    private String transport;

    // TODO 被装饰者行为
    @Override
    public Integer getCost() {
        return 50;//基本价
    }
}
