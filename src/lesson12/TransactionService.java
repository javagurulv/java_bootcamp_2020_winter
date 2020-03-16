package lesson12;

import java.util.*;

public class TransactionService {

    /*
    1. Find all transactions in the year 2011

        and sort them by value (small to high).
     */

    public List<Transaction> filterByYear(List<Transaction> transactions,
                                          int targetYear) {
        List<Transaction> transactionsByYear = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getYear() == targetYear) {
                transactionsByYear.add(transaction);
            }
        }
        return transactionsByYear;
    }

    public void sortTransactionsByVolume(List<Transaction> transactions) {
        TransactionYearComparator comparator = new TransactionYearComparator();
        transactions.sort(comparator);
    }

    public List<Transaction> question1(List<Transaction> transactions) {
        List<Transaction> transactions2011 = filterByYear(transactions, 2011);
        sortTransactionsByVolume(transactions2011);
        return transactions2011;
    }


    //2. What are all the unique cities
    // where the traders work?
    public Set<String> findUniqueCities(List<Transaction> transactions) {
        Set<String> uniqueCities = new HashSet<>();
        for (Transaction transaction : transactions) {
            Trader trader = transaction.getTrader();
            String city = trader.getCity();
            uniqueCities.add(city);
        }
        return uniqueCities;
    }


    /*
Questions:

3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders’ names sorted alphabetically.
5. Are any traders based in Milan?
6. Print all transactions’ values from the traders living in Cambridge.
7. What’s the highest value of all the transactions?
8. Find the transaction with the smallest value

     */

}
