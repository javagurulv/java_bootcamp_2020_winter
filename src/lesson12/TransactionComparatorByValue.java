package lesson12;

import java.util.Comparator;

public class TransactionComparatorByValue
    implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        int value1 = o1.getValue();
        int value2 = o2.getValue();
        return Integer.compare(value1, value2);
    }

}
