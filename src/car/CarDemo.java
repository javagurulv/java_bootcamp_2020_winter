package car;

public class CarDemo {

    public static void main(String[] args) {
        Car nissan = new Car("Nissan");
        Car bmw = new Car("BMW");

        Car bmw2 = new Car("BMW", 13);
        Car bmw3 = new Car("BMW", 0);


        nissan.accelerate();
        nissan.accelerate();
        nissan.accelerate();
        nissan.stoping();

        nissan.accelerate(10);
        nissan.stoping(5);

        int nissanCurrentSpeed = nissan.getCurrentSpeed();
        
        System.out.println("Nissan speed = " + nissanCurrentSpeed);

    }

}
