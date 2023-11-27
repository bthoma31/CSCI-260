package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String[] tailNums = new String[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter your tail number: ");
            tailNums[i]=keyboard.nextLine();
        }
        printData(tailNums);


    }
    public static void printData(String[]tailNums ){
        
        for(int i=0;i<tailNums.length;i++){
            System.out.println(tailNums[i]);
        }
    
}
}
