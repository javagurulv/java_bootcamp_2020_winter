package lesson12.cars;

public class ElectricCar extends Car {

    public ElectricCar(String model) {
        super(model);
    }

    public void acceleration() {
        this.currentSpeed = this.currentSpeed + 2;
    }

    public void stopping() {
        this.currentSpeed = this.currentSpeed - 2;
    }

}
