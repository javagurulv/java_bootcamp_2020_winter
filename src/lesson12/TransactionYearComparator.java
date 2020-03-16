package lesson12;

import java.util.Comparator;

public class TransactionYearComparator
        implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        int volume1 = o1.getValue();
        int volume2 = o2.getValue();

        if (volume1 == volume2) {
            return 0;
        }
        if (volume1 < volume2) {
            return -1;
        } else {
            return 1;
        }
    }
}
