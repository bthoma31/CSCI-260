package assignment6;
import java.util.ArrayList;
import java.util.Scanner;

public class assignmennt6 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        ArrayList<Integer> obj = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            System.out.println("Enter your annual subscription cost");
            obj.add(keyboard.nextInt());
        }
        System.out.println(obj);


    }
}
