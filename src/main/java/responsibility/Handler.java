package responsibility;

import lombok.Data;

/**
 * 抽象事件处理器
 */
@Data
public abstract class Handler {
    //下一个处理器
    protected Handler successor;
    //
    public abstract void handleRequest();

}
