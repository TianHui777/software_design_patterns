package responsibility;

import com.soft.entity.SOrder;
import lombok.Data;

/**
 * 表单合法性监察
 */
@Data
public class EmptyHandler extends Handler{


    @Override
    public String handleRequest(SOrder sOrder) {
        if (!sOrder.getDestination().isEmpty()
                && !sOrder.getDeparture().isEmpty()
                && !sOrder.getOrderName().isEmpty()
                && !sOrder.getTransport().isEmpty()
                && !sOrder.getPayerName().isEmpty()
                && !sOrder.getCost().equals(0)){
            return successor.handleRequest(sOrder);
        }

        else {
            return "提交的表单信息不能为空!";
        }
    }
}
