/*
Written by Brady Ruth
*/
public class SoundSystem extends VehicleDecorator{  // SoundSystem is a Vehicle modifier
    Vehicle vehicle;  // Establish a Vehicle

    public SoundSystem(Vehicle vehicle) {  // Create an instance of a new Vehicle
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return vehicle.getDescription() + ", awesome sound";  // Set the new description
    }

    public double getCost() {
        return vehicle.getCost() + 350;  // Adds the price of a Sound System to the total cost
    }
    
}
