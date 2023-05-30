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
        //�����ǽ�����ģʽ�Ĳ��Դ���
        OrderGenerator generator = new OrderGenerator(1);
        Order order;
        order = generator.newOrder("km","cq","not now","sheepxj03");
        System.out.println(order);

        //�����ǹ۲���ģʽ�Ĳ��Դ���,��������֮����ü���
        insertObservable iober =new insertObservable();
        Observer user=new User("sheepxj");
        Observer thirdPart =new ThirdPart("˳����");
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
