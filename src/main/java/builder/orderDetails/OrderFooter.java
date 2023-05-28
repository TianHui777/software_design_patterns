package builder.orderDetails;

public class OrderFooter {

    private String payerName;

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    @Override
    public String toString() {
        return "OrderFooter{" +
                "payerName='" + payerName + '\'' +
                '}';
    }
}
