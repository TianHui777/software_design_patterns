package abstractFactory;

import pojo.orderDetails.OrderContent;
import pojo.orderDetails.OrderFooter;
import pojo.orderDetails.OrderHeader;

public interface AbstractOrderFactory {


    OrderContent generateOrderContent();
    OrderFooter generateOrderFooter();
    OrderHeader generateOrderHeader();


}
