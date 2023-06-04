package builder;

import abstractFactory.SimpleOrderFactory;
import builder.orderDetails.Order;
import decorator.Decorator;
import decorator.FragileDecorator;
import decorator.UrgentDecorator;
import observer.Observer;
import observer.insertObservable;
import observer.obs.ThirdPart;
import observer.obs.User;

public class test {

    public static void test1(){
        //以下是建造者模式的测试代码
        OrderGenerator generator = new OrderGenerator(1);
        Order order;
        order = generator.newOrder("km","cq","not now","sheepxj03");
        System.out.println(order);

        //以下是观察者模式的测试代码,创建订单之后调用即可
        insertObservable iober =new insertObservable();
        Observer user=new User("sheepxj");
        Observer thirdPart =new ThirdPart("顺丰快递");
        iober.add(user);
        iober.add(thirdPart);
        iober.notifyObservers();
    }

    public static void test2(){
        SimpleOrderFactory simpleOrderFactory=new SimpleOrderFactory();
        Order a = simpleOrderFactory.createOrder("A");
        Decorator decorator=new UrgentDecorator(new FragileDecorator(a));
        System.out.println(decorator.getCost());
    }
    

    public static void main(String[] args) {
        test2();
    }

}
