package finalproject;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class project {
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
        for (int i = 0; i < num; i++) {
            System.out.print("Enter name:");
            keyboard.nextLine();
            String name = keyboard.nextLine();
            student st = new student(name);
            s1.add(st);
            System.out.println("How many classes does the student have?");
            int classNum = keyboard.nextInt();
            Stack obj = new Stack<String[]>();
            for (int j = 0; j < classNum; j++) {
                System.out.println("Enter name of the class");
                keyboard.nextLine();
                String className = keyboard.nextLine();
                System.out.println("Enter time of the class as an integer(in terms of World time so 9pm would be 21)");
                int time = keyboard.nextInt();
                st.addToSchedule(className, time);
            }
            System.out.println(st.getSortedSchedule());

        }

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