import java.util.ArrayList;
import java.util.Scanner;

public class challenge1a {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        ArrayList<String> obj=new ArrayList<String>();
        while(true){
            System.out.println("Enter your words: ");
            String sentence=keyboard.nextLine();
            System.out.println("Would you like to continue: yes or no");
            String quit=keyboard.nextLine();
            if(quit.equalsIgnoreCase("yes")){
                continue;
            }
            else{
                break;
            }
        }
        printData(obj);

    }
    
    public static void printData(ArrayList<String> words){
        
        for(String word:words){
            System.out.println("This is the data:"+word);
        }
    }
    
}

