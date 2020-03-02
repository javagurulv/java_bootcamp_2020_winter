package lesson8.mathoperations.multilayer;

public class ServiceImpl implements Service {

    private DataBase dataBase = new DataBaseOracleImpl();

    @Override
    public void addProduct(Product newProduct) {
        dataBase.save(newProduct);
    }

    @Override
    public Product findProduct(String name) {
        return dataBase.findByName(name);
    }

    @Override
    public void deleteProduct(String name) {
        dataBase.delete(name);
    }
}
