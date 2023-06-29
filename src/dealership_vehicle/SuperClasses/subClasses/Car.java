package dealership_vehicle.SuperClasses.subClasses;

import dealership_vehicle.SuperClasses.Fuel;
import dealership_vehicle.SuperClasses.Vehicle;

public class Car extends Vehicle {

    boolean hasAirConditioning;
    boolean hasRadio;
    private static  Fuel fuel1;

    //constructor
    public Car(String fuel, boolean motor, boolean steeringWheel, int quantOfpassengers, int quantOfDoors, int quantOfWheels, boolean cargoVehicle, double capacity_Kg, boolean hasRadio, boolean hasAirConditioning) {
        super(fuel, motor, steeringWheel, quantOfpassengers, quantOfDoors, quantOfWheels, cargoVehicle, capacity_Kg, fuel1);
        this.hasAirConditioning = hasAirConditioning;
        this.hasRadio = hasRadio;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }

    public static void setFuel1(Fuel fuel1) {
        Car.fuel1 = fuel1;
    }

    @Override
    public String toString() {
        return "\n\nCar " +
                "\n Fuel: "+getFuel() +
                "\n Motor: " + isMotor() +
                "\n Steering Wheel: "+ isSteeringWheel() +
                "\n Numbers of passengers: "+ getQuantOfpassengers() +
                "\n Numbers of doors: "+ getQuantOfDoors() +
                "\n Numbers of wheels: "+ getQuantOfWheels() +
                "\n Cargo vehicle: " + isCargoVehicle() +
                "\n Capacity: " + getCapacity_Kg() + " Kgs" +
                "\n Has Air Conditioning: " + hasAirConditioning +
                "\n Has Radio: " + hasRadio +
                "\n\n--------------------------------------------------";
    }
}
