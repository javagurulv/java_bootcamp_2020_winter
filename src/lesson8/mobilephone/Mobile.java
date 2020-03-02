package lesson8.mobilephone;

public abstract class Mobile implements MobilePhone {

    protected boolean power;
    protected String model;
    protected String os;

    public Mobile(String model, String os) {
        this.model = model;
        this.os = os;
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void power() {
        power = !power;
    }

    @Override
    public void sendSMS(String message) {
        System.out.println("Sending SMS" + message);
    }

    @Override
    public String receiveSMS() {
        return "Received SMS";
    }

    abstract void shareContent(String content);

}
