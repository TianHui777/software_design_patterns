package responsibility;

import lombok.Data;
import views.OrderInfo;

/**
 * 表单合法性监察
 */
@Data
public class LegalHandler extends Handler{


    @Override
    public String handleRequest(OrderInfo orderInfo) {
        if (!orderInfo.getPayer().isBlank()
                && !orderInfo.getDestination().isBlank()
                && !orderInfo.getDeparture().isBlank()){
            return successor.handleRequest(orderInfo);
        }

        else {
            return "提交的表单信息不能为空!";
        }
    }
}
