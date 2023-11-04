
import java.util.Scanner;

public class Doctor{
	
	public static void main (String []args){
		
		//cigerate
		//daiyly use
		
		
		Scanner input = new Scanner (System.in);
		 
		 
		 int [] ciga = new int [7];
		 
		 String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		 
		 int sum = 0;
		 
		  //avg =  [] ciga/7;
		  
	 System.out.print("Enter the price of cigarate");
	 int price = input.nextInt();
	 
		 
		//int total = 0;
		 
		for(int i = 0; i<ciga.length; i++){
			 
			 System.out.print("Enter the number of cigarate "+days[i]+ ":");
			 ciga[i] = input.nextInt();
			 sum+=ciga[i];
			 
			
		//total += ciga [i];
			 
			 }
			 
			 
			 System.out.println("week cost Cigerate "+sum*price);
			 
			 
			 int average = sum/7;
			 System.out.println("average of Cigerate  "+average);
			 
			 if(average<7){
				 
				 System.out.println("Normal Man");
				 
				 
				 }
				 
			else {
				
				System.out.println("Dengorous Man");
				
				}
				
				
			 
			 
			 
		 
		 
		 
	 }
 }
