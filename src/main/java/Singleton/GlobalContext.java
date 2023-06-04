package Singleton;
public class GlobalContext {

    String userType;
    Boolean isSpecial;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Boolean getSpecial() {
        return isSpecial;
    }

    public void setSpecial(Boolean special) {
        isSpecial = special;
    }

    /**
     * 静态构造方法，不允许外部实例化
     */
    private GlobalContext(String userType,Boolean isSpecial){
        this.isSpecial = isSpecial;
        this.userType = userType;
    }

    private static class HolderClass{
        private final static GlobalContext INSTANCE=new GlobalContext("normal",false);
    }

    public static GlobalContext getInstance(){
        return HolderClass.INSTANCE;
    }
}
