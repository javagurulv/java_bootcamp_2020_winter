package lesson12;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionServiceTest {

    private TransactionStorage storage = new TransactionStorage();
    private TransactionService service = new TransactionService();

    @Test
    public void testFindAllTraderNames() {
        List<Transaction> transactions = storage.getTransactions();
        String traderNames = service.findAllTraderNames(transactions);
        //System.out.println(traderNames);
        assertEquals(traderNames, "Alan,Brian,Mario,Raoul");
    }

    @Test
    public void testFindSmallestTransactionByValue() {
        List<Transaction> transactions = storage.getTransactions();
        Optional<Transaction> opt =
                service.findSmallestTransactionByValue(transactions);
        if (opt.isPresent()) {
            Transaction smallestTransaction = opt.get();
            assertNotNull(smallestTransaction);
        } else {
            System.out.println("Smallest transaction not found!");
        }

        //opt = Optional.empty();

        //opt = Optional.of(new Transaction(....));

    }

    @Test
    public void searchByYear() {
        List<Transaction> transactions = storage.getTransactions();
        SearchCriteria searchCriteria = new SearchCriteriaByYear(2011);
        List<Transaction> foundTransactions =
                service.search(transactions, searchCriteria);
        assertEquals(foundTransactions.size(), 2);
    }

    @Test
    public void searchByTraderCity() {
        List<Transaction> transactions = storage.getTransactions();
        SearchCriteria searchCriteria = new SearchCriteriaByTraderCity("Milan");
        List<Transaction> foundTransactions =
                service.search(transactions, searchCriteria);
        assertEquals(foundTransactions.size(), 2);
    }

    @Test
    public void testQuestion2() {
        List<Transaction> transactions = storage.getTransactions();
        Set<String> uniqueCities = service.findUniqueCities(transactions);
        assertEquals(uniqueCities.size(), 2);
        assertTrue(uniqueCities.contains("Cambridge"));
        assertTrue(uniqueCities.contains("Milan"));
    }

    @Test
    public void testQuestion1() {
        List<Transaction> transactions = storage.getTransactions();

        List<Transaction> result = service.question1(transactions);

        assertEquals(result.size(), 2);
        assertEquals(result.get(0).getValue(), 300);
        assertEquals(result.get(1).getValue(), 400);

        assertEquals(result.get(0).getYear(), 2011);
        assertEquals(result.get(1).getYear(), 2011);
    }

}
