package Memento;

import lombok.Data;
import views.OrderInfo;

@Data
public class OrderInfoOriginator extends OrderInfo {
    public OrderInfoMemento createMemento(){
        return new OrderInfoMemento(this);
    }

    public void restoreMemento(OrderInfoMemento orderInfoMemento){
        this.departure=orderInfoMemento.getDeparture();
        this.destination=orderInfoMemento.getDestination();
        this.fragile=orderInfoMemento.isFragile();
        this.payer=orderInfoMemento.getPayer();
        this.urgent=orderInfoMemento.isUrgent();
    }

}
