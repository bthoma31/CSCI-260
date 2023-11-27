import java.util.ArrayList;
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        ArrayList<Integer>obj= new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            System.out.println("Enter your values: ");
            obj.add(keyboard.nextInt());
         }
         logCalc(obj);
    }
    public static void logCalc(ArrayList<Integer> nums){
        for(Integer num:nums){
            System.out.println(num+","+Math.log(num));
        }

    }
    
}
