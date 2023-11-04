
import java.util.Scanner;


public class Demo2{
	
			public static void main(String[]args){
				Scanner scan = new Scanner(System.in);
				
				int [] numbers = new int[12];
				//int even = 0;
				
				for(int i=0; i<12; i++){
						
						 System.out.print("Enter Number"+(i+1)+" :");
						 numbers[i] = scan.nextInt();
						 
				}	
				for(int i=0; i<12; i++){
				
				if(numbers[i]%2==0){
					
					System.out.println("Even "+numbers[i]);
					
					}
				else if (numbers[i]%2!=0){
					
					System.out.println("odd "+numbers[i]);
					
					}
				}
		}
}	 
