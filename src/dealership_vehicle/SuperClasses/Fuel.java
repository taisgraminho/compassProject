package dealership_vehicle.SuperClasses;

public class Fuel {

    private static  String fuel;
    private boolean gasoline;
    private boolean ethanol;
    private boolean diesel;
    private boolean electricity;
    private boolean human;
    private boolean animal;

//constructor that compare if the value user's input is valid or not
    public Fuel(String fuel){
        switch (fuel){
            case "gasoline":
                gasoline = true;
                break;
            case "ethanol" :
                ethanol = true;
                break;
            case "diesel" :
                diesel = true;
                break;
            case "electricity" :
                electricity = true;
                break;
            case "human" :
                human = true;
                break;
            case "animal" :
                animal = true;
                break;
            default:
                System.out.println("\n\nType of fuel disabled! Please input one of the next options: ");
                System.out.println("gasoline, ethanol, diesel, electricity, human or animal.");
        }
        this.fuel = fuel;
        }

    public String getFuel() {
        return fuel;
    }

    public static void setFuel(String fuel) {
        Fuel.fuel = fuel;
    }
}




