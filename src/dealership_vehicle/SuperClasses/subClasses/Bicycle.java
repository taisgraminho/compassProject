package dealership_vehicle.SuperClasses.subClasses;

import dealership_vehicle.SuperClasses.Fuel;
import dealership_vehicle.SuperClasses.Vehicle;

public class Bicycle extends Vehicle {

    private boolean isElectric;
    private boolean hasRack;
    private static  Fuel fuel1;

    //constructor
    public Bicycle(String fuel, boolean motor, boolean steeringWheel, int quantOfpassengers, int quantOfDoors, int quantOfWheels, boolean cargoVehicle, double capacity_Kg, boolean isElectric, boolean hasRack) {
        super(fuel, motor, steeringWheel, quantOfpassengers, quantOfDoors, quantOfWheels, cargoVehicle, capacity_Kg,fuel1);
        this.isElectric = isElectric;
        this.hasRack = hasRack;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isHasRack(boolean hasRack) {
        return hasRack;
    }

    public void setHasRack(boolean hasRack) {
        this.hasRack = hasRack;
    }

    @Override
    public String toString() {
        return "\n\nBicycle" +
                "\n Fuel: "+getFuel() +
                "\n Motor: " + isMotor() +
                "\n Steering Wheel: "+ isSteeringWheel() +
                "\n Numbers of passengers: "+ getQuantOfpassengers() +
                "\n Numbers of doors: "+ getQuantOfDoors() +
                "\n Numbers of wheels: "+ getQuantOfWheels() +
                "\n Cargo vehicle: " + isCargoVehicle() +
                "\n Capacity: " + getCapacity_Kg() + " Kgs" +
                "\n Bicycle is electric: " + isElectric +
                "\n Bicycle has Rack: " + hasRack +
                "\n\n--------------------------------------------------";
         }


}
