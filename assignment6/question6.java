package assignment6;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] intArray = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter your numbers: ");
            intArray[i] = keyboard.nextInt();
        }
        bubbleSort(intArray);
        printArray(intArray);

    }

    private static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    // swap the elements!
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ",");
        }
    }
}
