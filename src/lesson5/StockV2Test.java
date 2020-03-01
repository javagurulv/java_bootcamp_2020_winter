package lesson5;


public class StockV2Test {

    public static void main(String[] args) {
        StockV2Test test = new StockV2Test();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        StockV2 stock = new StockV2("GOOG", 10);
        stock.updatePrice(20);
        stock.updatePrice(5);
        stock.updatePrice(14);
        String stockInfo = stock.getInformation();
        if(stockInfo.equals("Stock name: GOOG Current price: 14.00 Minimum price: 5.00 Maximum price: 20.00")) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2(){
        StockV2 stock = new StockV2("TESL", 10);
        stock.updatePrice(1);
        stock.updatePrice(45);
        stock.updatePrice(7);
        String stockInfo = stock.getInformation();
        if(stockInfo.equals("Stock name: TESL Current price: 7.00 Minimum price: 1.00 Maximum price: 45.00")) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test3(){
        StockV2 stock = new StockV2("INTE", 10);
        stock.updatePrice(4);
        stock.updatePrice(1);
        stock.updatePrice(7);
        stock.updatePrice(33);
        stock.updatePrice(31);
        stock.updatePrice(27);
        String stockInfo = stock.getInformation();
        if(stockInfo.equals("Stock name: INTE Current price: 27.00 Minimum price: 1.00 Maximum price: 33.00")) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

}

