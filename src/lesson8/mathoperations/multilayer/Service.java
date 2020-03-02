package lesson8.mathoperations.multilayer;

public interface Service {

    void addProduct(Product newProduct);

    Product findProduct(String name);

    void deleteProduct(String name);

}
