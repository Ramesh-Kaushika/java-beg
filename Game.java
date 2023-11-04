import java.util.Scanner;
import java.util.Random;

public class Game{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int [] rNumbers = new int[5];
		
		Random rn = new Random();
		

		for(int i =0; i < 5; i++)
		
		
			{
				
			int answer = rn.nextInt(10) + 1;
			System.out.println(answer);
			
			rNumbers [i] =rn.nextInt();
			
			
			}
		
		System.out.println("*** Generation Completed ***");
		
		
		
		System.out.println("Please input numbers ");
		int userNumber = input.nextInt();
		boolean result = false;
		
		for(int i = 0; i<5; i++){
		  
			
					
			if(userNumber == rNumbers[i]){
				
				result = true;
				
				if(result==true) {
				
				System.out.print("Game win");
				break;
				
				}
			}	
			
			
				
				else{
					
					
					System.out.print("Gamelost");
					break;
					
					}
					
				}
		
		}
	
	}
