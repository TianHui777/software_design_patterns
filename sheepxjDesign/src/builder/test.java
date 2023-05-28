package builder;

import builder.orderDetails.Order;
import observer.Observer;
import observer.insertObservable;
import observer.obs.ThirdPart;
import observer.obs.User;

public class test {
    public static void main(String[] args) {

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
}
