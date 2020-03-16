package lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransactionService {

    /*
    1. Find all transactions in the year 2011
        and sort them by value (small to high).
     */
    public List<Transaction> question1(List<Transaction> transactions) {
        List<Transaction> transactions2011 = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getYear() == 2011) {
                transactions2011.add(transaction);
            }
        }

        TransactionYearComparator comparator = new TransactionYearComparator();
        transactions2011.sort(comparator);

        return transactions2011;
    }

    /*
Questions:


2. What are all the unique cities where the traders work?
3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders’ names sorted alphabetically.
5. Are any traders based in Milan?
6. Print all transactions’ values from the traders living in Cambridge.
7. What’s the highest value of all the transactions?
8. Find the transaction with the smallest value
     */

}
