/*
Written by Brady Ruth
*/
public abstract class Vehicle {
    protected String description;  // Each Vehicle will have a String to describe its type, and any modifiers applied to it

    public String getDescription() {
        return description;  // returns the description of the Vehicle
    }

    public abstract double getCost();  // will return the total cost of the Vehicle. Still needs to be implemented elsewhere
}
