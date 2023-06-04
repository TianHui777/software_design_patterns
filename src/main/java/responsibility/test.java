package responsibility;

public class test {
    public static void main(String[] args) {
        Handler emptyHandler = new EmptyHandler();
        Handler specialCharacterHandler = new SpecialCharacterHandler();
        Handler globalEventHandler = new GlobalEventHandler();
        globalEventHandler.setSuccessor(emptyHandler);
        emptyHandler.setSuccessor(specialCharacterHandler);
    }
}
