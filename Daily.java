import java.util.Scanner;


public class Daily{
	
			public static void main(String[]args){
				Scanner scan = new Scanner(System.in);
				
				
			
				
			System.out.print("Enter Number : ");	
			int num = scan.nextInt();
			int intVal = 1;
			for(int i= num ;i>0;i--){
			
						intVal =intVal*i;
			
		   }
		   System.out.print("Factors "+intVal);
		}
	}	
