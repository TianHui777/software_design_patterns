package com.soft;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.entity.SOrder;
import com.soft.entity.SUser;
import com.soft.service.ISOrderService;
import com.soft.service.ISUserService;
import com.soft.service.impl.SOrderServiceImpl;
import com.soft.service.impl.SUserServiceImpl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Test {
    public static void test(){
        ISOrderService service=new SOrderServiceImpl();
        SOrder order=new SOrder();
        order.setOrderId(3);
        order.setCost(200);
        order.setTime(new Date());
        order.setDestination("666");
        order.setOrderName("99996666");
        order.setDeparture("333");
        order.setTransport("boat");
        order.setPayerName("111");
//        service.insert(order);
//        service.update(order);
        service.delete(order);
//        List<SOrder> sOrders = service.queryAll();
//        for (SOrder sOrder : sOrders) {
//            System.out.println(sOrder);
//        }
//        System.out.println(service.queryOne(order));
    }

    public static void test2(){
        ISUserService service=new SUserServiceImpl();
        SUser s=new SUser();
        s.setUserId(10);
        s.setUserName("xiaohong");
//        service.insert(s);
//        service.update(s);
//        System.out.println(service.queryOne(s));
//        for (SUser sUser : service.queryAll()) {
//            System.out.println(sUser);
//        }
        service.delete(s);
    }
    public static void main(String[] args) throws IOException {
//        test();
        test2();
    }
}
