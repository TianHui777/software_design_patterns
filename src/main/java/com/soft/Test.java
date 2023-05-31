package com.soft;

import com.soft.entity.SOrder;
import com.soft.service.ISOrderService;
import com.soft.service.impl.SOrderServiceImpl;

import java.io.IOException;
import java.util.Date;

public class Test {
    public static void test() throws IOException {
        ISOrderService service=new SOrderServiceImpl();
        SOrder order=new SOrder();
        order.setOrderId(2);
        order.setCost(200);
        order.setTime(new Date());
        order.setDestination("666");
        order.setOrderName("ynu");
        order.setDeparture("333");
        order.setTransport("air");
        service.insert(order);
    }
    public static void main(String[] args) throws IOException {
        test();
    }
}
