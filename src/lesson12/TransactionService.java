package lesson12;

import java.lang.annotation.Target;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TransactionService {

    //6. Print all transactions’ values
    //from the traders living in Cambridge.
    public String question6(List<Transaction> transactions) {
        return transactions.stream()
                //.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .filter(this::transactionFromCambridge)
                .map(transaction -> transaction.getValue())
                .map(value -> value.toString())
                .collect(Collectors.joining(","));

    }

    private boolean transactionFromCambridge(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Cambridge");
    }



    // 5. Are any traders based in Milan?
    public boolean isAnyTradeLocatedInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .anyMatch(city -> city.equals("Milan"));
    }

    public long countTradeLocatedInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .distinct()
                .count();
    }

    //4. Return a string of all traders’
    // names sorted alphabetically.
    public String findAllTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

    //8. Find the transaction with the smallest value
    public Optional<Transaction> findSmallestTransactionByValue(List<Transaction> transactions) {
        return transactions.stream()
                .min(new TransactionComparatorByValue());
    }


    // get unique years
    public Set<Integer> findAllUniqueTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                //.map(Transaction::getYear)
                .map(transaction -> transaction.getYear())
                .collect(Collectors.toSet());
    }

    // get unique traders


    // get unique trader cities


    public List<Transaction> searchUsingStreamApi(
            List<Transaction> transactions,
            SearchCriteria searchCriteria) {
        return transactions.stream()
                .filter(transaction -> searchCriteria.test(transaction))
                /*
                .filter(transaction -> transaction.getYear() == 2011)
                .filter(new Predicate<Transaction>() {
                    @Override
                    public boolean test(Transaction transaction) {
                        return transaction.getYear() == 2011;
                    }
                })*/
                .collect(Collectors.toList());
    }

    public List<Transaction> search(List<Transaction> transactions,
                                    SearchCriteria searchCriteria) {
        List<Transaction> foundTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (searchCriteria.test(transaction)) {
                foundTransactions.add(transaction);
            }
        }
        return foundTransactions;
    }


    public List<Transaction> filterByTraderCity(List<Transaction> transactions,
                                                String traderCity) {
        List<Transaction> transactionsByTraderCity = new ArrayList<>();
        for (Transaction transaction : transactions) {
            Trader trader = transaction.getTrader();
            if (trader.getCity().equals(traderCity)) {
                transactionsByTraderCity.add(transaction);
            }
        }
        return transactionsByTraderCity;
    }



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
6. Print all transactions’ values
from the traders living in Cambridge.
7. What’s the highest value of all the transactions?
8. Find the transaction with the smallest value

     */

}
