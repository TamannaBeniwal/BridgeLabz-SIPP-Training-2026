class ParkedVehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public ParkedVehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
    }
}

public class ParkingManagement {

    public static void displayCars(ParkedVehicle[] vehicles) {
        System.out.println("\n=== CARS ===");
        for (ParkedVehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.displayDetails();
            }
        }
    }

    public static void displayBikes(ParkedVehicle[] vehicles) {
        System.out.println("\n=== BIKES ===");
        for (ParkedVehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.displayDetails();
            }
        }
    }

    public static void main(String[] args) {

        ParkedVehicle[] vehicles = new ParkedVehicle[10];

        vehicles[0] = new ParkedVehicle("UP81AB101", "Rahul", "Car");
        vehicles[1] = new ParkedVehicle("UP81AB102", "Priya", "Bike");
        vehicles[2] = new ParkedVehicle("UP81AB103", "Aman", "Car");
        vehicles[3] = new ParkedVehicle("UP81AB104", "Neha", "Bike");
        vehicles[4] = new ParkedVehicle("UP81AB105", "Rohit", "Car");
        vehicles[5] = new ParkedVehicle("UP81AB106", "Simran", "Bike");
        vehicles[6] = new ParkedVehicle("UP81AB107", "Karan", "Car");
        vehicles[7] = new ParkedVehicle("UP81AB108", "Pooja", "Bike");
        vehicles[8] = new ParkedVehicle("UP81AB109", "Vikas", "Car");
        vehicles[9] = new ParkedVehicle("UP81AB110", "Anjali", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}