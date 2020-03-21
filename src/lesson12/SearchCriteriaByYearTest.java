package lesson12;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchCriteriaByYearTest {

    @Test
    public void test1() {
        SearchCriteria searchCriteria =
                new SearchCriteria() {
                    @Override
                    public boolean test(Transaction transaction) {
                        return transaction.getYear() == 2011;
                    }
                };
    }

    @Test
    public void test() {
        SearchCriteriaByYear searchCriteria = new SearchCriteriaByYear(2000);
        Transaction transaction = new Transaction(null, 2000, 999);
        boolean result = searchCriteria.test(transaction);
        assertTrue(result);
        transaction = new Transaction(null, 2020, 999);
        result = searchCriteria.test(transaction);
        assertFalse(result);
    }


}