package dealership_vehicle.SuperClasses.subClasses;

import dealership_vehicle.SuperClasses.Fuel;
import dealership_vehicle.SuperClasses.Vehicle;

public class Truck extends Vehicle {

    int quantAxles;
    private static  Fuel fuel1;

    //constructor
    public Truck(String fuel, boolean motor, boolean steeringWheel, int quantOfpassengers, int quantOfDoors, int quantOfWheels, boolean cargoVehicle, double capacity_Kg, int quantAxles) {
        super(fuel, motor, steeringWheel, quantOfpassengers, quantOfDoors, quantOfWheels, cargoVehicle, capacity_Kg, fuel1);
        this.quantAxles = quantAxles;
    }

    public int getQuantAxles() {
        return quantAxles;
    }

    public void setQuantAxles(int quantAxles) {
        this.quantAxles = quantAxles;
    }

    @Override
    public String toString() {
        return "\n\nTruck " +
                "\n Fuel: "+getFuel() +
                "\n Motor: " + isMotor() +
                "\n Steering Wheel: "+ isSteeringWheel() +
                "\n Numbers of passengers: "+ getQuantOfpassengers() +
                "\n Numbers of doors: "+ getQuantOfDoors() +
                "\n Numbers of wheels: "+ getQuantOfWheels() +
                "\n Cargo vehicle: " + isCargoVehicle() +
                "\n Capacity: " + getCapacity_Kg() + " Kgs" +
                "\n Numbers of axles: "+ getQuantAxles() +
                "\n\n--------------------------------------------------";

    }
}
