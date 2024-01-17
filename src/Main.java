public class Main {
    public static void main(String[] args) {
        Clothes shirt = new Clothes("Red", Size.M, Gender.MALE);
        Clothes dress = new Clothes("Blue", Size.L, Gender.FEMALE);
        Clothes jacket = new Clothes("Black", Size.XL, Gender.MALE);

        var clothes1 = shirt;
        var clothes2 = dress;
        var clothes3 = jacket;

        System.out.println("Shirt: Color=" + clothes1.getColor() + ", Size=" + clothes1.getSize() + ", Gender=" + clothes1.getGender());
        System.out.println("Dress: Color=" + clothes2.getColor() + ", Size=" + clothes2.getSize() + ", Gender=" + clothes2.getGender());
        System.out.println("Jacket: Color=" + clothes3.getColor() + ", Size=" + clothes3.getSize() + ", Gender=" + clothes3.getGender());
    }
}
