package Memento;

import lombok.Data;

@Data
class OrderInfoMemento {

    OrderInfoMemento(OrderInfoOriginator orderInfoOriginator){
        this.departure=orderInfoOriginator.getDeparture();
        this.destination=orderInfoOriginator.getDestination();
        this.fragile=orderInfoOriginator.isFragile();
        this.payer=orderInfoOriginator.getPayer();
        this.urgent=orderInfoOriginator.isUrgent();
    }


    String departure;

    String destination;

    String payer;

    boolean urgent;

    boolean fragile;

}
