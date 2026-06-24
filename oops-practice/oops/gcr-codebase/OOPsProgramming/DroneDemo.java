class Drone {
    private String droneId;
    private int batteryPercentage;

    static String companyName = "SkyLogistics";


    public Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println(droneId + " started delivery.");
            batteryPercentage -= 20; // consume battery
        } else {
            System.out.println(droneId +
                    " cannot start delivery. Low battery!");
        }
    }

    // Display Status Method
    public void displayStatus() {
        System.out.println("\nCompany Name      : " + companyName);
        System.out.println("Drone ID          : " + droneId);
        System.out.println("Battery Remaining : " +
                batteryPercentage + "%");
    }
}

public class DroneDemo {
    public static void main(String[] args) {


        Drone d1 = new Drone("DR101", 80);
        Drone d2 = new Drone("DR102", 60);
        Drone d3 = new Drone("DR103", 15);

        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        System.out.println("\nShared Company Name:");
        System.out.println(Drone.companyName);
    }
}