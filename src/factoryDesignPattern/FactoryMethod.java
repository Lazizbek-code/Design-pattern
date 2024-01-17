package factoryDesignPattern;

public class FactoryMethod {
    private FactoryMethod(){
        System.out.println("Calling private constructor");
    }

    public static FactoryMethod getInstance(){
        System.out.println("Calling factory method");
        return new FactoryMethod();
    }
}
