package observer;

import builder.orderDetails.Order;

import java.util.ArrayList;
import java.util.Observable;

public class insertObservable extends Observable {

    protected ArrayList<Observer> roles = new ArrayList<Observer>();

    public void add(Observer obs) {
        roles.add(obs);
    }

    public void remove(Observer obs) {
        roles.remove(obs);
    }

    public void notifyObservers() {
        for (Object obs : roles) {
            System.out.println(((Observer) obs).getMsg());
        }
    }
}
