import java.util.ArrayList;
import java.util.Random;

public class challenge3 {
    public static void main(String[] args) {
         int intArray[]=new int[25];
        for(int i=0;i<25;i++){
            intArray[i]=new Random().nextInt(9000) + 1000;
        }
        System.out.println("array before sorting:");
        printArray(intArray);
        bubbleSort(intArray);
        System.out.println("");
        System.out.println("array after sorting:");
        printArray(intArray);
       
    }
    public static void printArray(int []intArray){
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
            }
    }
        public static void bubbleSort(int[] intArray){
                int n = intArray.length;
                int temp = 0;
                for(int i=0; i < n; i++){
                    for(int j=1; j < (n-i); j++){
                        if(intArray[j-1] > intArray[j]){

                            temp = intArray[j-1];
                            intArray[j-1] = intArray[j];
                            intArray[j] = temp;
        }
                    
}
}
}

            
 }

