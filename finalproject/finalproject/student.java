package finalproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class student {
  public String name;
  public Hashtable<String, Integer> schedule;

  public student(String name) {
    this.name = name;
    this.schedule = new Hashtable<>();
  }

  public void addToSchedule(String className, int classTime) {
    schedule.put(className, classTime);
  }

  public void printSchedules() {

  }

  // method that takes class times and stores it in an array and then bubble sorts
  // it into queue
  public Queue<String> getSortedSchedule() {
    ArrayList<String[]> temp = new ArrayList<>(); // queue

    Enumeration<String> keys = schedule.keys();
    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      String[] keyValuePair = new String[] { key, schedule.get(key).toString() }; // array to take the keys and the
                                                                                  // values of the hashmap and combine
                                                                                  // them into one array pair and stores
                                                                                  // into an arraylist
      temp.add(keyValuePair);
    }

    // bubble sort the arraylist by time and put into queue in right order

    for (int i = temp.size() - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        String[] pair1 = temp.get(j);
        String[] pair2 = temp.get(j + 1);

        if (Integer.parseInt(pair1[1]) > Integer.parseInt(pair2[1])) {
          // Swap the elements
          String[] tempPair = pair1;
          temp.set(j, pair2);
          temp.set(j + 1, tempPair);
        }
      }
    }

    // Create an empty Queue to store the sorted schedule
    Queue<String> sortedSchedule = new LinkedList<>();

    // Iterate through the sorted ArrayList and add the class names to the Queue
    for (String[] pair : temp) {
      sortedSchedule.add(pair[0]);
    }

    return sortedSchedule;
  }

}
