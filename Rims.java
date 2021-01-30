/*
Written by Brady Ruth
*/
public class Rims extends VehicleDecorator{
    Vehicle vehicle;

    public Rims(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return vehicle.getDescription() + ", cool rims";
    }

    public double getCost() {
        return vehicle.getCost() + 200;
    }
    
}
