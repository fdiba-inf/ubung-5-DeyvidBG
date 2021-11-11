package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        // Find unique numbers in numbers

        bubbleSort(numbers);

        int j = 0;
        int br = 0;
        int counter = 0;
        for(int i = 1; i < numbers.length; i++) {
          if(numbers[j] != numbers[i]) {
            uniqueNumbers[br] = numbers[j];
            j = i;
            br++;
            counter = 0;
          } 
          counter++;
          if(i == (numbers.length - 1) && counter != 0) {
            uniqueNumbers[br] = numbers[j];
          }
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
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
