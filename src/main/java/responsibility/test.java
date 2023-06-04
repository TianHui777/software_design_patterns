package responsibility;

public class test {
    public static void main(String[] args) {
        // 非空检测
        Handler emptyHandler = new EmptyHandler();
        // 特殊字符检测
        Handler specialCharacterHandler = new SpecialCharacterHandler();
        // 全局检测
        Handler globalEventHandler = new GlobalEventHandler();
        globalEventHandler.setSuccessor(emptyHandler);
        emptyHandler.setSuccessor(specialCharacterHandler);
    }
}
