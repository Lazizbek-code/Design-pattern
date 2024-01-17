public class AppMain {
    public static void main(String[] args) {
        // Singleton instance usage
        Application app = Application.getInstance();
        app.run();

        // Phone object creation and usage
        Phone myPhone = new Phone("My Phone", Model.PHONE, 64);
        System.out.println("Phone: Name=" + myPhone.getName() + ", Model=" + myPhone.getModel() + ", Storage=" + myPhone.getStorage() + "GB");
    }
}
