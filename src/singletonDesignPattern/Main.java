package singletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singletonOne = Singleton.getInstance();
        Singleton singletonTwo = Singleton.getInstance();
        System.out.println(System.identityHashCode(singletonOne));
        System.out.println(System.identityHashCode(singletonTwo));
    }
}
