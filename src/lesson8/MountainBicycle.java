package lesson8;

public class MountainBicycle extends Bicycle{

    protected int gear;

    public MountainBicycle(String brand, int speed, int gear) {
        super(brand, speed);
        this.gear = gear;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }

    @Override
    public String toString() {        return "MountainBicycle{" +
                "gear=" + gear +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
