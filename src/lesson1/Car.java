package lesson1;

public class Car {

    private String model;
    private String color;
    private int uniqueNumber;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model,
               String color,
               int uniqueNumber) {
        this.model = model;
        this.color = color;
        this.uniqueNumber = uniqueNumber;
    }

    public void star() {
        System.out.println(this.model + " started!");
    }

    public void stop() {
        System.out.println(this.model + " stopped!");
    }

}
