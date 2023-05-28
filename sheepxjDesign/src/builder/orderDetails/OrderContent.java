package builder.orderDetails;

public class OrderContent {

    private String destination;
    private String departure;
    private String time;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "OrderContent{" +
                "destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
