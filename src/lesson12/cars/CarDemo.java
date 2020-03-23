package lesson12.cars;

public class CarDemo {

    public static void main(String[] args) {

        Car electricCar = new ElectricCar("Tesla");
        electricCar.acceleration();
        electricCar.acceleration();
        electricCar.acceleration();
        System.out.println("Electric car current speed = " + electricCar.getCurrentSpeed());

        Car petrolCar = new PetrolCar("Nissan");
        petrolCar.acceleration();
        petrolCar.acceleration();
        petrolCar.acceleration();
        System.out.println("Petrol car current speed = " + petrolCar.getCurrentSpeed());
    }

}
