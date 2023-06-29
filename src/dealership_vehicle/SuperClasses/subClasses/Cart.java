package dealership_vehicle.SuperClasses.subClasses;

import dealership_vehicle.SuperClasses.Fuel;
import dealership_vehicle.SuperClasses.Vehicle;

public class Cart extends Vehicle {

    private static  Fuel fuel1;

    //constructor
    public Cart(String fuel, boolean motor, boolean steeringWheel, int quantOfpassengers, int quantOfDoors, int quantOfWheels, boolean cargoVehicle, double capacity_Kg) {
        super(fuel, motor, steeringWheel, quantOfpassengers, quantOfDoors, quantOfWheels, cargoVehicle, capacity_Kg, fuel1);
    }

    @Override
    public String toString() {
        return "\n\nCart " +
                "\n Fuel: "+getFuel() +
                "\n Motor: " + isMotor() +
                "\n Steering Wheel: "+ isSteeringWheel() +
                "\n Numbers of passengers: "+ getQuantOfpassengers() +
                "\n Numbers of doors: "+ getQuantOfDoors() +
                "\n Numbers of wheels: "+ getQuantOfWheels() +
                "\n Cargo vehicle: " + isCargoVehicle() +
                "\n Capacity: " + getCapacity_Kg() + " Kgs" +
                "\n\n--------------------------------------------------";

    }
}

