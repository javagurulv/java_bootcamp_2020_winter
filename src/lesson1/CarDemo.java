package lesson1;

public class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car("Nissan");
        Car car2 = new Car("Ferrary");
        Car car3 = new Car("BMW");

        Car car4 = new Car("BMW", "red");
        Car car5 = new Car("BMW", "black");

        Car car6 = new Car("BMW", "black", 23123);

        car1.star();
        car1.stop();

        car2.star();
        car2.stop();

    }

}
