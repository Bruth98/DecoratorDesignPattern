/*
Written by Brady Ruth
*/
public class SoundSystem extends VehicleDecorator{
    Vehicle vehicle;

    public SoundSystem(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return vehicle.getDescription() + ", awesome sound";
    }

    public double getCost() {
        return vehicle.getCost() + 350;
    }
    
}
