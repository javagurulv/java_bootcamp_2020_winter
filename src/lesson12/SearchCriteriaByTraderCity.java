package lesson12;

public class SearchCriteriaByTraderCity
        implements SearchCriteria {

    private String traderCity;

    public SearchCriteriaByTraderCity(String traderCity) {
        this.traderCity = traderCity;
    }

    @Override
    public boolean test(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals(traderCity);
    }
}
