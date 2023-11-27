package qhm;

import java.util.Hashtable;
import java.util.Scanner;

public class hm {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Hashtable<String, String> boats = new Hashtable<String, String>();
        while (true) {
            System.out.println("Enter your boat name");
            String name = keyboard.nextLine();
            System.out.println("Enter your boat number");
            String number = keyboard.nextLine();
            boats.put(name, number);
            System.out.println("Do you want to keep adding boats?");
            String quit = keyboard.nextLine();
            if (quit.equalsIgnoreCase("yes")) {
                continue;
            } else {
                System.out.println(boats);
                break;
            }

        }
        searchValue(boats);

    }

    public static void searchValue(Hashtable<String, String> boats) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to check if your boat number exists in our directory");
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("What boat do you want to search for? ");
            String search = keyboard.nextLine();

            System.out.println(boats.get(search));
        } else {
            System.out.println("Shipped Away....");
        }
    }

}
