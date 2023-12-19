package finalproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class project {
    public static BT bt = new BT(); // Binary tree to store the classes and times

    public static void main(String[] args) {
        System.out.println("Welcome to Bik & Noy's Schedule Comparer");
        Scanner keyboard = new Scanner(System.in);
        getOptions();
    }

    // linked list that stores students you want to compare and then stores the
    // classes and times for each student in a hashtable
    public static void createSchedule() {
        Scanner keyboard = new Scanner(System.in);
        LinkedList<student> s1 = new LinkedList<>();
        System.out.println("How many people do you want to input?");
        int num = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter name:");
            String name = keyboard.nextLine();
            student st = new student(name);
            s1.add(st);
            System.out.println("How many classes does the student have?");
            int classNum = keyboard.nextInt();
            keyboard.nextLine();

            int j = 0; // loop variable
            Stack<String[]> tempSchedule = new Stack<>(); // Creating stack to hold values temporarily
            ArrayList<Integer> times = new ArrayList<Integer>();
            while (j < classNum) {
                System.out.println("Enter name of the class (type undo to undo the last class)");
                String className = keyboard.nextLine();
                // If undo command is triggered, then the last class is removed from the stack
                // and the loop is continued (j is decremented to account for the removed class)
                if (className.equalsIgnoreCase("undo") && !tempSchedule.isEmpty()) {
                    tempSchedule.pop();
                    System.out.println("Last class removed");
                    j--;
                    continue;
                }
                System.out
                        .println("Enter time of the class as an integer (in terms of World time, so 9pm would be 21)");
                int time = keyboard.nextInt();
                keyboard.nextLine();
                times.add(time);
                String[] keyValuePair = new String[] { className, Integer.toString(time) };
                tempSchedule.push(keyValuePair);
                j++;
            }

            // Adding from stack to Hashtable and binary tree
            while (!tempSchedule.isEmpty()) {
                String[] pair = tempSchedule.pop();
                System.out.println(pair[0] + " " + pair[1]);
                st.addToSchedule(pair[0], Integer.parseInt(pair[1]));
                // If it exists in the binary tree already, then it is not added again
                if (!bt.contains(pair)) {
                    bt.insert(pair);
                }
            }
            getDifference(times);
            System.out.println(st.getSortedSchedule());

        }
        searchTree(bt);
        // TESTING
        /*
         * System.out.println("Directory of Classes Entered: " + bt.countNodes());
         * System.out.println();
         * bt.inorder();
         * System.out.println();
         */
    }

    // method that prints out the linkedlist if the user wants too
    public static void printStudents(LinkedList<student> s) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to see the students?");
        String ans = keyboard.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            System.out.println(s);
        }

    }

    public static void getOptions() {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create Scehdule");
            System.out.println("2. Exit");
            int option = keyboard.nextInt();
            switch (option) {
                case 1:
                    createSchedule();
                    break;

                case 2:
                    System.out.println("Thank you for using NOY AND BIKS Schedule Comparer!");
                    System.out.println("Exting programm....");
                    System.exit(0);
                    ;
                    break;

                default:
                    break;
            }
        }

    }

    public static void getDifference(ArrayList<Integer> times) {
        int difference;
        ArrayList<Integer> diff = new ArrayList<Integer>();
        for (int i = 0; i < times.size() - 1; i++) {
            difference = times.get(i + 1) - times.get(i) - 1;
            diff.add(difference);
            System.out.println("Your free time is: " + difference + " hours");

        }
        suggestActivity(diff);

    }

    public static void suggestActivity(ArrayList<Integer> diff) {
        for (Integer diffs : diff) {
            if (diffs <= 1) {
                System.out.println("You don't have free time. Stay in School!! Have a study session!");
            } else if (diffs > 1) {
                System.out.println("You have more than an hour go get food or play basketball");
            } else {
                System.out.println("Just go home!");
            }
        }

    }

    public static void searchTree(BT bt) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Enter class to search for (type no to exit) ");
            if (keyboard.hasNextLine()) {
                String address = keyboard.nextLine();
                if (bt.search(address)) {
                    System.out.println("Class found!");
                } else if (address.equalsIgnoreCase("no")) {
                    break;
                }
            }
        }
    }
}
