package week7;

import java.util.Scanner;

public class ass7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a integer to start from: ");
        int start = keyboard.nextInt();
        addTen(start, 1);

    }

    public static void addTen(int x, int count) {
        if (count < 21) {
            System.out.println("Number: " + x);
            x = x + 10;
            addTen(x, count + 1);

        }

    }
}
