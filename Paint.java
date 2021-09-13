/*
Written by Brady Ruth
*/
public class Paint extends VehicleDecorator{  // This will be a modifier applied to a Vehicle
    Vehicle vehicle;  // Establish a Vehicle

    public Paint(Vehicle vehicle) {  // Create an instance of a new Vehicle
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return vehicle.getDescription() + ", fancy paint";  // Update the description of the Vehicle
    }

    public double getCost() {
        return vehicle.getCost() + 150;  // Adds the price of paint to the total cost
    }
    
}
