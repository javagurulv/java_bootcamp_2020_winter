package lesson8;

public class Bicycle {

    protected String brand; //This variable is protected and cannot be accessed from another package or through child of class Bicycle
    protected int speed;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed++;
    }

    public void decelerate() {
        this.speed--;
    }

}

