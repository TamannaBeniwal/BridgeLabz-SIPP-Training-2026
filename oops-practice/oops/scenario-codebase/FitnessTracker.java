interface Track {

    void logActivity();

    // Default method
    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Report {
    void generateReport();
}

interface Notifi {
    void sendAlert();
}

class FDevice implements Track, Report, Notifi {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps completed.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report Generated: Calories Burned = 350");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }
}

public class FitnessTracker {
    public static void main(String[] args) {

        FDevice device = new FDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();
    }
}