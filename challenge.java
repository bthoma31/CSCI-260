import java.util.LinkedList;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        LinkedList<String> teams=new LinkedList<String>();
        while(true){
            
            System.out.println("Welcome to Team Repository");
            System.out.println("Choose an option: add | remove | quit");
            String choice=keyboard.nextLine();
            System.out.println(teams);
            
            
            if(choice.equalsIgnoreCase("add")){
                System.out.println("Enter team name");
                teams.add(keyboard.nextLine());


            }
            else if(choice.equalsIgnoreCase("remove")){
                System.out.println("Which team would you like to remove?");
                teams.remove(keyboard.nextLine());
            }
            else if(choice.equalsIgnoreCase("quit")){
                break;
            }
            

        }
        
    }
}
