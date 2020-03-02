package lesson8.mobilephone;

public class Samsung extends Mobile {

    public Samsung(String model, String os) {
        super(model, os);
    }

    @Override
    void shareContent(String content) {
        System.out.println("Sharing content with Bluetooth");
    }

}
