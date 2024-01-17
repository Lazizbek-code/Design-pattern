public class Application {
    // Singleton instance
    private static Application instance;

    // Private constructor to prevent instantiation
    private Application() {
    }

    // Singleton instance creation method
    public static synchronized Application getInstance() {
        if (instance == null) {
            instance = new Application();
        }
        return instance;
    }

    // Run method with all the logic
    public void run() {
        // Your logic goes here
        System.out.println("Application is running...");
    }
}
