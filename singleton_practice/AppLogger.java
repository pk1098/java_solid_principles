package singleton_practice;

public class AppLogger {
    private static AppLogger instance;

    private AppLogger() {
        // Private constructor to prevent instantiation
    }

    public static AppLogger getInstance() {
        if (instance == null) {
            instance = new AppLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
