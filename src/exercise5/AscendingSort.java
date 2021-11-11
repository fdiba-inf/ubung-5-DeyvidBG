package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // Sort numbers in ascending order
        bubbleSort(numbers);

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }

    static void bubbleSort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
          swapped = false;
          j++;
          for (int i = 0; i < array.length - j; i++) {
            if (array[i] > array[i + 1]) {
              tmp = array[i];
              array[i] = array[i + 1];
              array[i + 1] = tmp;
              swapped = true;
            }
          }
        }
    }
}
