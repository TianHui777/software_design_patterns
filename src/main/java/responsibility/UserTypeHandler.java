package responsibility;

import lombok.Data;
import views.OrderInfo;

@Data
public class UserTypeHandler extends Handler{
    @Override
    public String handleRequest(OrderInfo orderInfo) {
        return null;
    }
}
