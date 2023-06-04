package responsibility;

import com.soft.entity.SOrder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacterHandler extends Handler{

    // 定义正则表达式，匹配特殊字符
    String regex = "[^a-zA-Z0-9]";

    // 创建Pattern对象
    Pattern pattern = Pattern.compile(regex);

    @Override
    public String handleRequest(SOrder sOrder) {

        // 创建Matcher对象
        Matcher matcher1 = pattern.matcher(sOrder.getOrderName());
        Matcher matcher2 = pattern.matcher(sOrder.getDeparture());
        Matcher matcher3 = pattern.matcher(sOrder.getPayerName());
        Matcher matcher4 = pattern.matcher(sOrder.getDestination());
        Matcher matcher5 = pattern.matcher(sOrder.getTransport());

        if (!matcher1.find() && !matcher2.find()
                && !matcher3.find() && !matcher4.find()
                && !matcher5.find()){
            return successor.handleRequest(sOrder);
        }else {
            return "用户输入的信息存在非法字符，请重新输入";
        }

    }
}
