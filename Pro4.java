import java.util.*;
public class Pro4 {
    
    public static void reverseUsingAuxArray(int[] arr) {
        int[] aux = new int[arr.length];
        
        int i = arr.length -1;
        int j = 0;
        
        //fill the reverse of arr
        //in aux array
        while(i >= 0) {
            aux[j] = arr[i];
            i--;j++;
        }
        
        //fill back the array arr
        for(i=0;i<arr.length;i++) {
            arr[i] = aux[i];
        }
        
    }
    
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("enter elements ");
		int x = input.nextInt();
		
		
       // int[] arr = new int [x];
        
        for(i=0; i< arr.length; i++);
        
       // System.out.print("print arrays ")
        arr [i] = input.nextInt();
        
        reverseUsingAuxArray(arr);
        display(arr);
    }
}
