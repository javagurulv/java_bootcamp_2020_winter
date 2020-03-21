package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TransactionStorage {

    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        Transaction transaction1 = new Transaction(brian, 2011, 300);
        Transaction transaction2 = new Transaction(raoul, 2012, 1000);
        Transaction transaction3 = new Transaction(raoul, 2011, 400);
        Transaction transaction4 = new Transaction(mario, 2012, 710);
        Transaction transaction5 = new Transaction(mario, 2012, 700);
        Transaction transaction6 = new Transaction(alan, 2012, 950);

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        transactions.add(transaction4);
        transactions.add(transaction5);
        transactions.add(transaction6);

        return transactions;
    }

}
