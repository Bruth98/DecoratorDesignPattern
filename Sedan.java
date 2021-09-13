/*
Written by Brady Ruth
*/
public class Sedan extends Vehicle{  // Sedan is a type of Vehicle
    public Sedan() {
        this.description = "Sedan";  // Set the description of a Sedan
    }

    public double getCost() {  // implements the getCost method from the Vehicle Class
        return 20000;  // Set the price of a Sedan
    }
}
