import dealership_vehicle.SuperClasses.subClasses.*;

public class App {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("carbon", false, false, 1, 0, 2, false, 100, false, false );
        System.out.println(bicycle);

        Car car = new Car("gasoline", true, true, 5, 4, 4, false, 450, true, true);
        System.out.println(car);

        Cart cart1 = new Cart("animal", false, false, 3, 0, 4, true, 500);
        System.out.println(cart1);

        Moto moto = new Moto("aluminium", true, true, 2, 0, 2, false, 300, true);
        System.out.println(moto);

        Truck truck = new Truck("ethanol", true, true, 3, 2, 22, true, 7600.00, 9);
        System.out.println(truck);

        bicycle.setFuel("Human");
        bicycle.setMotor(true);
        bicycle.setHasRack(true);
        bicycle.setElectric(true);

        System.out.println(bicycle);

        moto.setFuel("Gasoline");
        System.out.println(moto);






    }
}