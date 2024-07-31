package exercise_1;

public class Logger {

    private static Logger instance;


    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to print messages
    public void displayLog(String message) {
        System.out.println("Log message: " + message);
    }
}

