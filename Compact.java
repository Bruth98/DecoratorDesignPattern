/*
Written by Brady Ruth
*/
public class Compact extends Vehicle{  // a Compact car is a Vehicle
    public Compact() {  // Constructs a compact car
        this.description = "Compact";  // Setting the description of a Compact Vehicle
    }

    public double getCost() {  // Implements the getCost method from the Vehicle Class
        return 15000;  // Set the price of a Compact Vehicle
    }
    
}
