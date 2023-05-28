package builder.orderDetails;

public class OrderHeader {

    private String orderName;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "OrderHeader{" +
                "orderName='" + orderName + '\'' +
                '}';
    }
}
