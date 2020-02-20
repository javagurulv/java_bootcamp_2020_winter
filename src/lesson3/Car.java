package lesson3;

public class Car {

    private String name;
    private String model;
    private String color;
    private int currentSpeed;
    private boolean engineOnOff;

    public Car(String  name) {
        this.name = name;
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public void turnOnEngine() {
        System.out.println("Engine is ON");
        engineOnOff = true;
    }

    public void turnOffEngine() {
        System.out.println("Engine is OFF");
        engineOnOff = false;
    }

    public void setCarCurrentSpeed(int newSpeed) {
        currentSpeed = newSpeed;
    }

    public void riseSpeed() {
//        currentSpeed = currentSpeed + 1;
        currentSpeed++;
    }

    public void downSpeed() {
//        currentSpeed = currentSpeed - 1;
        currentSpeed--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean getEngineOnOff() {
        return engineOnOff;
    }

    public void setEngineOnOff(boolean engineOnOff) {
        this.engineOnOff = engineOnOff;
    }
}
