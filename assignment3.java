import java.util.ArrayList;
import java.util.Scanner;


public class assignment3 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your list that you would like to bubble sort Include a , betweeen the numbers");
        String userInput=keyboard.nextLine();
        String[]myArray=userInput.split(",");
        int []intArray=new int[myArray.length];
        for(int i=0;i<myArray.length;i++){
            intArray[i]=Integer.parseInt(myArray[i]);
        }
        System.out.println("Array before sorting:");
        printArray(intArray);
        bubbleSort(intArray);
        System.out.println("");
        System.out.println("Array after sorting:");
        printArray(intArray);


        
    }
    public static void printArray(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    private static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        for(int i=0; i < n; i++){
        for(int j=1; j < (n-i); j++){
        if(intArray[j-1] > intArray[j]){
        //swap the elements!
        temp = intArray[j-1];
        intArray[j-1] = intArray[j];
        intArray[j] = temp;
        }
        }
        }
        }
        }
        
        

    

    
    
 
        

