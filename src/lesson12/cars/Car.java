package lesson12.cars;

public abstract class Car {

    private String model;
    protected int currentSpeed;

    public Car(String model) {
        this.model = model;
        this.currentSpeed = 0;
    }

    public abstract void acceleration();

    public abstract void stopping();

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

}
