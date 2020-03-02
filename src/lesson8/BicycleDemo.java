package lesson8;

public class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Pinarello", 15);
        MountainBicycle mountainBicycle = new MountainBicycle("BMC", 42, 2);

        System.out.println(bicycle);
        System.out.println(mountainBicycle);

        System.out.println("Speed up!");
        mountainBicycle.accelerate();

        System.out.println(bicycle);
        System.out.println(mountainBicycle);
    }
}
