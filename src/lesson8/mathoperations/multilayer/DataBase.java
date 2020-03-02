package lesson8.mathoperations.multilayer;

public interface DataBase {

    void save(Product product);

    void delete(String name);

    Product findByName(String name);

}
