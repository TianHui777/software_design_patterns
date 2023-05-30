package views;

import lombok.Data;

@Data
public class OrderInfo {
    protected String departure;

    protected String destination;

    protected String payer;

    protected boolean urgent;

    protected boolean fragile;
}
