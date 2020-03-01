package lesson5;

public class StockV2 {

    private String companyName;
    private double currentPrice;
    private double maxPrice;
    private double minPrice;

    public StockV2(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }

    public void updatePrice(double newPrice){
        currentPrice = newPrice;

        if(newPrice > maxPrice){
            maxPrice = newPrice;
        }
        if(newPrice < minPrice){
            minPrice = newPrice;
        }
    }

    public String getInformation(){
        return ("Stock name: " +companyName +
                " Current price: " + String.format("%.2f", currentPrice) +
                " Minimum price: " + String.format("%.2f", minPrice) +
                " Maximum price: " + String.format("%.2f", maxPrice));
    }


    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }
}
