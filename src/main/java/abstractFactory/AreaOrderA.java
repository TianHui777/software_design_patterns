package abstractFactory;

import builder.orderDetails.*;

public class AreaOrderA implements AbstractOrderFactory{
    @Override
    public OrderContent generateOrderContent() {
        return new OrderContentA();
    }

    @Override
    public OrderFooter generateOrderFooter() {
       return new OrderFooterA();
    }

    @Override
    public OrderHeader generateOrderHeader() {
       return new OrderHeaderA();
    }



}
