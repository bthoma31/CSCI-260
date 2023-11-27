package assignment6;

import java.util.LinkedList;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        LinkedList<String> countries=new LinkedList<String>();
        for(int i=0;i<2;i++){
            System.out.println("Enter your countries:");
            countries.add(keyboard.nextLine());
        }
        System.out.println(countries);

    }
}
