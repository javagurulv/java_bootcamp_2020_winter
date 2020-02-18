package lesson5;

public class Train {

    private String engineType;
    private int maxSpeed;

    private int cartCount;
    private int currentSpeed;
    private double currentEmission;
    private boolean engineOn;

    public Train(String engineType, int maxSpeed) {
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
    }

    public void ignition() {
        engineOn = !engineOn;
        System.out.println("Is engine ON: " + engineOn);
    }

    public void speedUp() {
        if (engineOn && (currentSpeed < maxSpeed)) {
//            currentSpeed = currentSpeed + 1;
            currentSpeed += 10;
            currentEmission += 0.2;
            System.out.println("Current speed: " + currentSpeed);
        } else if (currentSpeed == maxSpeed) {
            System.out.println("Speed is MAX");
        } else {
            System.out.println("Engine is OFF");
        }
    }

    public void speedDown() {
        if (currentSpeed > 0) {
//            currentSpeed = currentSpeed - 10;
            currentSpeed -= 10;
            currentEmission -= 0.2;
            System.out.println("Current speed: " + currentSpeed);
        } else {
            System.out.println("I'm already stopped!");
        }
    }

    public void addCart() {
        if (currentSpeed == 0) {
            cartCount++;
            System.out.println("Cart added");
        } else {
            System.out.println("I'M MOVING!!!");
        }
    }

    public void removeCart() {
        if (cartCount > 0) {
            cartCount--;
            System.out.println("Cart removed");
        } else {
            System.out.println("No more carts!");
        }
    }


    public String getEngineType() {
        return engineType;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getCurrentEmission() {
        return currentEmission;
    }

    public void setCurrentEmission(double currentEmission) {
        this.currentEmission = currentEmission;
    }

    public boolean isEngineOn() {
        return engineOn;
    }
}
