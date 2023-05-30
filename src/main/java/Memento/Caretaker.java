package Memento;

import java.util.ArrayList;

public class Caretaker {

    private ArrayList<OrderInfoMemento> mementos = new ArrayList<>();
    public OrderInfoMemento getMementoByIndex(int i){
        return mementos.get(i);
    }

    public void setMementos(OrderInfoMemento orderInfoMemento){
        mementos.add(orderInfoMemento);
    }

}
