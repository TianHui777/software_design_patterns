package Singleton;

import lombok.Data;
public class GlobalContext {

    String userType;
    Boolean isSpecial;

    /**
     * 静态构造方法，不允许外部实例化
     */
    private GlobalContext(String userType,Boolean isSpecial){
        this.isSpecial = isSpecial;
        this.userType = userType;
    }

    private static class HolderClass{
        private final static GlobalContext INSTANCE=new GlobalContext("common",false);
    }

    public static GlobalContext getInstance(){
        return HolderClass.INSTANCE;
    }
}
