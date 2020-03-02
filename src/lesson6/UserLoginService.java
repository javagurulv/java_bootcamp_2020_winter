package lesson6;

public class UserLoginService {

    public void login(User user, int pinCode) {
        user.setPassword("qwerty");
        pinCode = 4321;
        System.out.println("From login service" + pinCode);
    }
}
