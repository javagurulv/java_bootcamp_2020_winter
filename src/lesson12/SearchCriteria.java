package lesson12;

@FunctionalInterface
public interface SearchCriteria {

    boolean test(Transaction transaction);

}
