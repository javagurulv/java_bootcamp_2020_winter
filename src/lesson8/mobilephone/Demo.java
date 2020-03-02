package lesson8.mobilephone;

public class Demo {

    public static void main(String[] args) {
        Samsung s10 = new Samsung("S10", "Android 10");

//        s10.call();
//        s10.power();
//        s10.call();
//        s10.sendSMS("Hello!");
//        String SMS = s10.receiveSMS();
//        System.out.println(SMS);
        s10.shareContent("Content");


        Apple iPhone = new Apple("iPhone", "iOS");
//
//        iPhone.power();
//        iPhone.call();
//        iPhone.receiveSMS();
//        iPhone.sendSMS("Hello from iPhone");

        iPhone.shareContent("Content");

    }
}
