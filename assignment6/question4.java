package assignment6;

import java.util.Scanner;
import java.util.Stack;

public class question4 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        Stack obj=new Stack<String>();
        for(int i=0;i<3;i++){
            System.out.println("Enter your word processing choice");
            obj.push(keyboard.nextLine());
            
        }
         for(int i=0;i<3;i++){
            System.out.println("UNDO: "+obj.pop());
         }
        


    }
   
}

