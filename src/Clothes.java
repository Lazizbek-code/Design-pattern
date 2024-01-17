public class Clothes {
    private String color;
    private Size size;
    private Gender gender;

    public Clothes(String color, Size size, Gender gender) {
        this.color = color;
        this.size = size;
        this.gender = gender;
    }
    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public Gender getGender() {
        return gender;
    }
}
