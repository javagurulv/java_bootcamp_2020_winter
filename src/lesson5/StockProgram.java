package lesson5;

public class StockProgram {

    public static void main(String[] args) {
        Stock teslaStock = new Stock("Tesla", 100.00);
        teslaStock.printInformation();
        teslaStock.updatePrice(10.00);
        teslaStock.updatePrice(1000.00);
        teslaStock.updatePrice(999.00);
        teslaStock.printInformation();

        Stock intelStock = new Stock("Intel", 100.00);
        intelStock.printInformation();
        intelStock.updatePrice(10.00);
        intelStock.updatePrice(109990.00);
        intelStock.updatePrice(1.00);
        intelStock.printInformation();

    }

}
