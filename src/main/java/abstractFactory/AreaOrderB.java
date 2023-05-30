package abstractFactory;

import builder.orderDetails.*;

public class AreaOrderB implements AbstractOrderFactory{
    @Override
    public OrderContent generateOrderContent() {
        return new OrderContentB();
    }

    @Override
    public OrderFooter generateOrderFooter() {
       return new OrderFooterB();
    }

    @Override
    public OrderHeader generateOrderHeader() {
       return new OrderHeaderB();
    }



}
