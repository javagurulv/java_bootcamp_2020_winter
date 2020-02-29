package lesson7;

public class ArrayFunction {

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int findMinValue(int[] arr) {
        int minNumber = Integer.MAX_VALUE;
        // int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minNumber > arr[i]) {
                minNumber = arr[i];
            }
        }

/*
        for (int value : arr) {
            if (minNumber > value) {
                minNumber = value;
            }
        }
*/

        return minNumber;
    }

}
