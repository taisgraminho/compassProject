package dealership_vehicle.SuperClasses.subClasses;

import dealership_vehicle.SuperClasses.Fuel;
import dealership_vehicle.SuperClasses.Vehicle;

public class Moto extends Vehicle {

    private boolean isElectric;
    private static  Fuel fuel1;

    //constructor
    public Moto(String fuel, boolean motor, boolean steeringWheel, int quantOfpassengers, int quantOfDoors, int quantOfWheels, boolean cargoVehicle, double capacity_Kg, boolean isElectric) {
        super(fuel, motor, steeringWheel, quantOfpassengers, quantOfDoors, quantOfWheels, cargoVehicle, capacity_Kg, fuel1);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "\n\nMoto:" +
                "\n Fuel: "+getFuel() +
                "\n Motor: " + isMotor() +
                "\n Steering Wheel: "+ isSteeringWheel() +
                "\n Numbers of passengers: "+ getQuantOfpassengers() +
                "\n Numbers of doors: "+ getQuantOfDoors() +
                "\n Numbers of wheels: "+ getQuantOfWheels() +
                "\n Cargo vehicle: " + isCargoVehicle() +
                "\n Capacity: " + getCapacity_Kg() + " Kgs" +
                "\n Moto is electric: " + isElectric +
                "\n\n--------------------------------------------------";

    }
}
