package lesson6;

public class Demo {

    public static void main(String[] args) {
        UserLoginService userLoginService = new UserLoginService();
        User alexUser = new User("Alex", "1234");
        User ruslanUser = new User("Ruslan", "1234");
        User alex2User = new User("Alex", "1234");
        alexUser.setLogin("Vasja");
        System.out.println(alexUser.getLogin());
        System.out.println(alexUser.getPassword());
    }

}
