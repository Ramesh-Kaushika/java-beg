import java.util.Arrays;
import java.util.Scanner;

class SumValue{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int [] number = new int [10];
		int sum =0;
		for(int i=0; i<number.length; i++){
			
			System.out.println();
			number [i] = scan.nextInt();
			//sum+=number[i]; 
			 sum = sum+number[i];
			 
			 
			
			
			}
			
			System.out.println("sum "+sum);
		
	}
}	
	
