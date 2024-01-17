package builderDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .id("100")
                .firstName("Lazizbek")
                .build();

        System.out.println(employee);

    }
}
