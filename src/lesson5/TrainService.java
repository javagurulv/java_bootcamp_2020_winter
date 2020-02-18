package lesson5;

public class TrainService {

    public static void main(String[] args) {
        Train electric = new Train("Electric", 200);
//        Train coal = new Train("Coal", 200);

        System.out.println("Train engine type: " + electric.getEngineType());
//        System.out.println("Train engine type: " + coal.getEngineType());
        electric.ignition();

        electric.addCart();
        electric.addCart();
        electric.addCart();

        System.out.println(electric.getCartCount());

        electric.speedUp();
        electric.speedUp();

        electric.addCart();

    }
}
