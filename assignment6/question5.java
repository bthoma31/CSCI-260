package assignment6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        Queue<String> obj=new LinkedList<>();
        for(int i=0;i<4;i++){
            System.out.println("Enter four word proccesing choices:");
            obj.add(keyboard.nextLine());
        }
        for (String s:obj) {
            System.out.println("REDO:"+ s);
            
        }


    }
}
