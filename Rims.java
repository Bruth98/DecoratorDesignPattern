/*
Written by Brady Ruth
*/
public class Rims extends VehicleDecorator{
    Vehicle vehicle;  // Establish a new Vehicle

    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;  // Create an instance of a new Vehicle
    }

    public String getDescription() {
        return vehicle.getDescription() + ", cool rims";  // Adds a description of the Rims to the Vehicle
    }

    public double getCost() {
        return vehicle.getCost() + 200;  // Adds the price of the Rims to the Vehicle
    }
    
}
