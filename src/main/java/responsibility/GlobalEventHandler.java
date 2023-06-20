package responsibility;

import Singleton.GlobalContext;
import com.soft.entity.SOrder;
import lombok.Data;

@Data
public class GlobalEventHandler extends Handler{
    GlobalContext globalContext=GlobalContext.getInstance();
    @Override
    public String handleRequest(SOrder sOrder) {
        if (!globalContext.getSpecial()&&("normal".equals(globalContext.getUserType()))){
            return successor.handleRequest(sOrder);
        }
        else if (globalContext.getSpecial()){
            return "当前仓库有特殊事件，无法创建订单!";
        }
        else {
            return "当前用户存在异常行为，无法创建订单!";
        }
    }
}
