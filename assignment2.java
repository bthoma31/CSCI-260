import java.util.LinkedList;
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        LinkedList<String> teams=new LinkedList<String>();
        while(true){
            System.out.println("Welcome to Sports Team Repository!");
            System.out.println("Choose an option: Add  | Remove | Quit");
            System.out.println(teams);
            String choice=keyboard.nextLine();
            if(choice.equalsIgnoreCase("add")){
                 System.out.println("Enter team: ");
                teams.add(keyboard.nextLine());
                
                
            }
            else if(choice.equalsIgnoreCase("remove")){
                System.out.println("Which team would you like to remove");
                teams.remove(keyboard.nextLine());
                
                   
            }
            else if(choice.equalsIgnoreCase("quit")){
                break;
            }
            
            
            
        }
        System.out.println(teams);
    }
    

   
    
    
}
