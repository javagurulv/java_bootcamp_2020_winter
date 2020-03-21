package lesson9;

public class Safe {

    private int money;
    private int password;

    private boolean isOpen;

    public Safe(int password) {
        this.money = 0;
        this.password = password;
    }

    public boolean putMoney(int password, int moneyToAdd) {
        if (password == this.password) {
            this.money = this.money + moneyToAdd;
            return true;
        } else {
            return false;
        }
    }

    public boolean getMoney(int password, int moneyToGet) {
        if ((password == this.password) && (this.money >= moneyToGet)) {
            this.money = this.money - moneyToGet;
            return true;
        } else {
            return false;
        }
    }

}
