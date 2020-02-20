package lesson5;

public class Stock {

   private String companyName;
   private double currentPrice;
   private double minPrice;
   private double maxPrice;

   public Stock(String companyName,
                double currentPrice) {
      this.companyName = companyName;
      this.currentPrice = currentPrice;
      this.minPrice = currentPrice;
      this.maxPrice = currentPrice;
   }

   public void updatePrice(double newPrice) {
      this.currentPrice = newPrice;
      if (newPrice < minPrice) {
         this.minPrice = newPrice;
      }
      if (newPrice > maxPrice) {
         this.maxPrice = newPrice;
      }
   }

   public void printInformation() {
      System.out.println("Company name = " + this.companyName);
      System.out.println("Current price = " + this.currentPrice);
      System.out.println("Max price = " + this.maxPrice);
      System.out.println("Min price = " + this.minPrice);
   }

}
