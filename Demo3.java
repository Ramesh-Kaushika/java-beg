import java.util.Scanner;


public class Demo3{
	
			public static void main(String[]args){
				Scanner scan = new Scanner(System.in);
				
				String [] names = new String[6];
				double    [] marks = new double  [6];
				double max;
				double min;
				
				for(int i=0; i<6; i++){
					
					System.out.print("Student name "+(i+1)+ ":- ");
					names[i]= scan.next();
					
					System.out.print("Student marks :- ");
					marks[i]= scan.nextDouble();
					System.out.println();
					
					}
					//int j=0;
					
				for(int i=0; i<6; i++){
					
					
					System.out.print("Student name "+names[i]+"-");
					
					System.out.println();
					System.out.println(" Student marks "+marks[i]);
				}	
					max = marks[0];
					min = marks[0];
					for(int i=0; i<6; i++){
						
						if(max<marks[i]){
							
							max=marks[i];
					     if(min>marks[i]){
							 
							 
							 min=marks[i];
							 
							 }
	
						
						}
				}
						
						System.out.println("Max Marks"+max);
						System.out.println("Min Marks"+min);
					
	     }
		}
				
