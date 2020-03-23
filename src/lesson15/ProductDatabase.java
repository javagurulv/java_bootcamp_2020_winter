package lesson15;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private int currentID = 1;
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        product.setId(currentID);
        products.add(product);
        this.currentID++;
    }

    public List<Product> getProducts() {
        return products;
    }

}
