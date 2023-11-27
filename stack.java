import java.util.Scanner;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("What value do you want to contribute to your 401k? (The max for this year is $23500)");
        int contribution=keyboard.nextInt();
        System.out.println("What interest rate to want please put it in decimal form?");
        double interest=keyboard.nextDouble();
        Stack obj=new Stack();
        double annualTotal=0;
        double runningTotal=0;
        for(int i=0;i<=30;i++){
            annualTotal=(contribution*interest);
            obj.push(annualTotal);
            runningTotal+=annualTotal;


        }
        System.out.println("This what you earn every year that you contribute: "+obj+"\nYour total over the 30 years is:"+runningTotal);


}
}
