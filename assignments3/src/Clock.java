public class Clock {
    // Private static member to hold the unique instance
    private static Clock instance;
    static int time;

    // Private constructor to prevent instantiation from outside
    private Clock() {
        // Initialization code
    }

    // Public static method to access the unique instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public static int getTime() {
        return time;
    }

    public static void setTime(int time) {
        Clock.time = time;
    }
}