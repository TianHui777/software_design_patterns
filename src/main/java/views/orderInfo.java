package views;

import lombok.Data;

@Data
public class orderInfo {
    private String departure;

    private String destination;

    private String payer;

    private boolean urgent;

    private boolean fragile;
}
