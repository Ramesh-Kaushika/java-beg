import java.util.Scanner;

public class RainData{
	
	public static void main (String []args){
		
		
		Scanner input = new Scanner (System.in);
		 
		 
		 double [] rainData = new double [7];
		 
		
		 //store data in array 
		 
		 
		 
		 for(int i=0; i<7; i++){
			 
			 System.out.print("daya by day rain data "+(i+1))
			 rainData[i]=input.nextDouble();
				//average+=rainData[i];
			 
			 
			 }
			 //get sum
		 double sum = 0.0;
		 System.out.println("week rain average is: "+(average/7));
		
		}
	
	
	}
