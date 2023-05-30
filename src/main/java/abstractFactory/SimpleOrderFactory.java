package abstractFactory;

import builder.orderDetails.Order;

public class SimpleOrderFactory {

    AbstractOrderFactory orderFactoryA=new AreaOrderA();
    AbstractOrderFactory orderFactoryB=new AreaOrderB();
    public Order createOrder(String type){
        if ("A".equalsIgnoreCase(type)){
            return new Order(orderFactoryA);
        }else if ("B".equalsIgnoreCase(type)){
            return new Order(orderFactoryB);
        }
        return null;
    }

}
