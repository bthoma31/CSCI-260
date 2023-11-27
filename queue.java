
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("What is your home value?");
        int homeValue=keyboard.nextInt();
        System.out.println("What is your down payment?");
        int downPayment=keyboard.nextInt();
        System.out.println("What is your interest rate?");
        double interest=keyboard.nextDouble();
        System.out.println("What is your principle?");
        int principle=keyboard.nextInt();
        int newHome=homeValue-downPayment;
        double interestPay=(interest*principle)+principle;
        Queue<Double> obj=new LinkedList<>();
        for(int i=0;i<12;i++){
            double monthlyInterest=(interest/12/100)*newHome;
            monthlyInterest+=principle;
            obj.add(monthlyInterest);
            newHome -=(principle+monthlyInterest);

        }
        System.out.println(obj);

    }
}
