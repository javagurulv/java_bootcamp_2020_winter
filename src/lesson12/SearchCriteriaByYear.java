package lesson12;

public class SearchCriteriaByYear implements SearchCriteria {

    private int year;

    public SearchCriteriaByYear(int year) {
        this.year = year;
    }

    @Override
    public boolean test(Transaction transaction) {
        return transaction.getYear() == year;
    }
}
