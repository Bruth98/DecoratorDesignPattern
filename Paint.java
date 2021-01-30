/*
Written by Brady Ruth
*/
public class Paint extends VehicleDecorator{
    Vehicle vehicle;

    public Paint(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDescription() {
        return vehicle.getDescription() + ", fancy paint";
    }

    public double getCost() {
        return vehicle.getCost() + 150;
    }
    
}
