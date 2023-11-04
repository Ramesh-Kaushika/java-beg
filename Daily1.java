import java.util.Scanner;
import java.util.Arrays;

public class Daily1{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
			String [] name   = new String[10];
			double [] height = new double[10];
			double [] weight = new double[10];
			
			System.out.println();
			
			//Input name,weight,height
			
			for(int i=0; i<10; i++){
				
				System.out.print("Patient's Name :- ");
				 name[i] = scan.next();
				
				System.out.print("Patient's Height(cm) :- ");
				 height[i] = scan.nextDouble();
				
				System.out.print("Patient's Weight(kg):- ");
				 weight[i] = scan.nextDouble();
				
				System.out.println();
				
				}
			//check BMI formula
			
			for(int i=0; i<10; i++){
				
				height[i]=(weight[i])/((height[i]*2)/100);
		
				
				
				
				System.out.println((i+1)+" "+name[i]+" BMi "+height[i]);
				//check body type
				
				 if(height[i]< 18)
				 
						{
							System.out.println("BMI Underwaight "+name[i]);
							System.out.println();
						}
				 else if(25 > height[i] && height[i]> 18){
					 
							System.out.println("BMI Normal "+name[i]);
							System.out.println();
					 }
				
				else if(height[i] >25){
					
					System.out.println("BMI Overwaight "+name[i]);
					System.out.println();
					
					}
					
					else{
						
						System.out.println("This is not a man");
						System.out.println();
						
						}
								
						
				}
				//max BMI
				
				int maxBmiPositio = 0;
				double maxBmi = height[0];
	
				
				for(int i=0; i<10; i++){
							
							
					if(maxBmi<height[i]){
								
								maxBmi = height[i];
								maxBmiPositio = i;
								
								}
  
							
							}
				System.out.println("highest BMI "+name[maxBmiPositio]+" "+maxBmi);
				
				//Min BMI
				
				double minBmi = height[0];
				int minBmiPositio = 0;			
					
						
				for(int i=0; i<10; i++){
							
							
					if(minBmi>height[i]){
								
								minBmi = height[i];
								minBmiPositio = i;
								
								}
								
	
							}
							
							//Ascending Order
				
				System.out.println("lowest BMI "+name[minBmiPositio]+" "+minBmi);	
				
				for(int i=0; i<height.length; i++){
					
					System.out.println("BMI values of each patient "+name[i]+" "+height[i]);
					
					}
					
				
	
	  }
	
	}
