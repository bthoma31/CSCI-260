package finalproject;

import java.util.Hashtable;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        System.out.println("Welcome to Bik & Noy's Schedule Comparer");
        System.out.println("Choose an Option:");
        System.out.println(" 1.  Enter your class & time");
        System.out.println(" 2.  Add a part");

    }

    public static void array() {

    }

    public static void Stack() {

    }

    public static void Hashmap() {
        Scanner keyboard = new Scanner(System.in);
        Hashtable<String, String> c1 = new Hashtable<String, String>();
        while (true) {
            System.out.println("Enter a class name:");
            String className = keyboard.nextLine();
            System.out.println("Enter your class time: ex. 11");
            String section = keyboard.nextLine();
            c1.put(className, section);
            System.out.println("Do you want to keep adding classes?");
            String quit = keyboard.nextLine();
            if (quit.equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }

        }
    }

    public static void Queue() {

    }

    public static void LinkedList() {

    }
}
