package abstractFactory;

import pojo.orderDetails.OrderContent;
import pojo.orderDetails.OrderFooter;
import pojo.orderDetails.OrderHeader;

public class CommonUserOrder implements AbstractOrderFactory{
    @Override
    public OrderContent generateOrderContent() {
        return null;
    }

    @Override
    public OrderFooter generateOrderFooter() {
        return null;
    }

    @Override
    public OrderHeader generateOrderHeader() {
        return null;
    }



}
