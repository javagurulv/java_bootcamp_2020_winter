package lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();

        System.out.println("Is Empty = " + ints.isEmpty());

        System.out.println("Size = " + ints.size());

        for (int i = 0; i < 10; i++) {
            ints.add(i);  // dobavlenie v konec spiska
        }
        System.out.println("Size = " + ints.size());

        ints.add(0, 99);

        for (int i = 0; i < ints.size(); i++) {
            int element = ints.get(i);
            System.out.print(element + " , ");
        }

        ints.remove(1);
        printList(ints);

        ints.set(0, 777);
        printList(ints);

        System.out.println("Is Empty = " + ints.isEmpty());

        ints.add(9);
        printList(ints);
        ints.remove(new Integer(9));
        printList(ints);

        ints.add(9);
        printList(ints);
        List<Integer> intsToRemove = new ArrayList<>();
        intsToRemove.add(9);
        intsToRemove.add(777);
        ints.removeAll(intsToRemove);
        printList(ints);

        removeAllEvenNumbers(ints);
        printList(ints);

        boolean contains = ints.contains(new Integer(777));
        System.out.println("Contains = " + contains);
    }

    private static void removeAllEvenNumbers(List<Integer> ints) {
        List<Integer> toRemove = new ArrayList<>();
        for (int i = 0; i < ints.size(); i++) {
            int element = ints.get(i);
            if ((element % 2) == 0) {
                toRemove.add(element);
            }
        }
        ints.removeAll(toRemove);

/*
        List<Integer> finalList = ints.stream()
                .filter(element -> (element % 2) != 0)
                .collect(Collectors.toList());
*/

    }

    private static void printList(List<Integer> ints) {
        System.out.println();
        for (int i = 0; i < ints.size(); i++) {
            int element = ints.get(i);
            System.out.print(element + " , ");
        }
        System.out.println();
    }


}
