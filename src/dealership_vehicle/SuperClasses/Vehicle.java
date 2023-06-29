package dealership_vehicle.SuperClasses;
public class Vehicle extends Fuel {

    private boolean motor;
    private boolean steeringWheel;
    private int quantOfpassengers;
    private int quantOfDoors;
    private int quantOfWheels;
    private boolean cargoVehicle;
    private double capacity_Kg;
    private Fuel fuel;

    //constructor
    public Vehicle(String fuel, boolean motor, boolean steeringWheel, int quantOfpassengers, int quantOfDoors, int quantOfWheels, boolean cargoVehicle, double capacity_Kg, Fuel fuel1) {
        super(fuel);
        this.motor = motor;
        this.steeringWheel = steeringWheel;
        this.quantOfpassengers = quantOfpassengers;
        this.quantOfDoors = quantOfDoors;
        this.quantOfWheels = quantOfWheels;
        this.cargoVehicle = cargoVehicle;
        this.capacity_Kg = capacity_Kg;
        this.fuel = fuel1;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public boolean isSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(boolean steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public int getQuantOfpassengers() {
        return quantOfpassengers;
    }

    public void setQuantOfpassengers(int quantOfpassengers) {
        this.quantOfpassengers = quantOfpassengers;
    }

    public int getQuantOfDoors() {
        return quantOfDoors;
    }

    public void setQuantOfDoors(int quantOfDoors) {
        this.quantOfDoors = quantOfDoors;
    }

    public int getQuantOfWheels() {
        return quantOfWheels;
    }

    public void setQuantOfWheels(int quantOfWheels) {
        this.quantOfWheels = quantOfWheels;
    }

    public boolean isCargoVehicle() {
        return cargoVehicle;
    }

    public void setCargoVehicle(boolean cargoVehicle) {
        this.cargoVehicle = cargoVehicle;
    }

    public double getCapacity_Kg() {
        return capacity_Kg;
    }

    public void setCapacity_Kg(double capacity_Kg) {
        this.capacity_Kg = capacity_Kg;
    }

    public String getFuel(String fuel) {
        return fuel = fuel;
    }


    @Override
    public String toString() {
        String s = "Vehicle{" +
                "motor=" + motor +
                ", steeringWheel=" + steeringWheel +
                ", quantOfpassengers=" + quantOfpassengers +
                ", quantOfDoors=" + quantOfDoors +
                ", quantOfWheels=" + quantOfWheels +
                ", cargoVehicle=" + cargoVehicle +
                ", capacity_Kg=" + capacity_Kg +
                ", fuel='" + fuel + '\'' +
                '}';
        return s;
    }
}
