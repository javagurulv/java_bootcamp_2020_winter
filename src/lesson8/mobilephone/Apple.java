package lesson8.mobilephone;

public class Apple extends Mobile {

    public Apple(String model, String os) {
        super(model, os);
    }

    @Override
    void shareContent(String content) {
        System.out.println("Sharing content with airDrop");
    }


}
