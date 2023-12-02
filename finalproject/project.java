package finalproject;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class project {
    public static BT bt = new BT(); // Binary tree to store the classes and times
    public static void main(String[] args) {
        System.out.println("Welcome to Bik & Noy's Schedule Comparer");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Fill out your schedule to continue");
        createSchedule();
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
            while (j < classNum) {
                System.out.println("Enter name of the class (type undo to undo the last class)");
                String className = keyboard.nextLine();
                // If undo command is triggered, then the last class is removed from the stack and the loop is continued (j is decremented to account for the removed class)
                if (className.equalsIgnoreCase("undo") && !tempSchedule.isEmpty()) {
                    tempSchedule.pop();
                    System.out.println("Last class removed");
                    j--;
                    continue;
                }
                System.out.println("Enter time of the class as an integer (in terms of World time, so 9pm would be 21)");
                int time = keyboard.nextInt();
                keyboard.nextLine(); 
                String[] keyValuePair = new String[]{className, Integer.toString(time)};
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
            System.out.println(st.getSortedSchedule());
        }
        // TESTING
        System.out.println("the binary tree: " + bt.countNodes());
        System.out.println();
        bt.postorder();
        System.out.println("\n\n\n");
        System.out.println(bt.calculateDifferences());
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
        System.out.println("Choose an option:");

    }

}