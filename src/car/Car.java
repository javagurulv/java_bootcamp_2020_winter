package car;



public class Car {

    private String model;
    private int currentSpeed;

    public Car(String model) {
        this.model = model;
        this.currentSpeed = 0;
    }

    public Car(String model, int currentSpeed) {
        this.model = model;
        this.currentSpeed = currentSpeed;
    }


    public void accelerate() {
        this.currentSpeed = this.currentSpeed + 1;
    }

    public void accelerate(int speedUp) {
        this.currentSpeed = this.currentSpeed + speedUp;
    }

    public void stoping() {
        this.currentSpeed = this.currentSpeed - 1;
    }

    public void stoping(int speedDown) {
        this.currentSpeed = this.currentSpeed - speedDown;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

}
