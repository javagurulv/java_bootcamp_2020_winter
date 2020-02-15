package lesson3;

public class CarDemo {

    public static void main(String[] args) {
        Car kiaCar = new Car("KIA", "SPORTAGE", "Metallic Brown");
        Car bmwCar = new Car("BMW", "X6", "Metallic Blue");
        System.out.println("Is engine on? - " + kiaCar.getEngineOnOff());
        System.out.println("Current speed is: " + kiaCar.getCurrentSpeed());

        kiaCar.turnOnEngine();
        System.out.println("Is engine on? - " + kiaCar.getEngineOnOff());

        kiaCar.setCarCurrentSpeed(100);
        System.out.println("Current speed is: " + kiaCar.getCurrentSpeed());

        kiaCar.downSpeed();
        System.out.println("Current speed is: " + kiaCar.getCurrentSpeed());

        System.out.println("BMW Speed: " + bmwCar.getCurrentSpeed());



    }
}
