/*
Written by Brady Ruth
*/
public class SportsCar extends Vehicle{  // Sports Car is a type of Vehicle
    public SportsCar() {
        this.description = "Sports Car";  // Set the description
    }

    public double getCost() {  // Implements the getCost method from the Vehicle Class
        return 30000;  // Set the cost
    }
}
