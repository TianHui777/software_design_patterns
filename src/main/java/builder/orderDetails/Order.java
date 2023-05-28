package builder.orderDetails;

public class Order {
    private Integer orderId;

    private OrderHeader orderHeader;

    private OrderFooter orderFooter;

    private OrderContent orderContent;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public OrderContent getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(OrderContent orderContent) {
        this.orderContent = orderContent;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public OrderFooter getOrderFooter() {
        return orderFooter;
    }

    public void setOrderFooter(OrderFooter orderFooter) {
        this.orderFooter = orderFooter;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderHeader=" + orderHeader +
                ", orderFooter=" + orderFooter +
                ", orderContent=" + orderContent +
                '}';
    }
}
