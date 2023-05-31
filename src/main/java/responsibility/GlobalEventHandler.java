package responsibility;

import lombok.Data;
import views.OrderInfo;

/**
 * 全局异常处理器
 */
@Data
public class GlobalEventHandler extends Handler{
    @Override
    public String handleRequest(OrderInfo orderInfo) {
        return null;
    }
}
