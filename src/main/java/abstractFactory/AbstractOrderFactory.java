package abstractFactory;


import builder.orderDetails.OrderContent;
import builder.orderDetails.OrderFooter;
import builder.orderDetails.OrderHeader;

public interface AbstractOrderFactory {


    OrderContent generateOrderContent();
    OrderFooter generateOrderFooter();
    OrderHeader generateOrderHeader();


}
