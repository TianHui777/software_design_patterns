package abstractFactory;

import pojo.Order;

public class SimpleOrderFactory {

    AbstractOrderFactory orderFactory;
    public Order createOrder(String type){
        // TODO 订单简单工厂
        if ("VIP".equalsIgnoreCase(type)){
            return null;
        }

        return null;
    }

}
