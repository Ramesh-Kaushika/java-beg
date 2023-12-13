
import java.util.*;
import java.util.Scanner;

class Pro1{
	public static void main(String[]args){
		
		Scanner input = new Scanner (System.in);
		
		//String [] months = {"First-Month","Second-Month","Third-Month","Fourth-Month","Fifth-Month","Six-Month"};
		
		System.out.print("How many Family Members ");
		int x = input.nextInt();
		
		System.out.print("How many months do you want ");
		int y = input.nextInt();
		
		
		
		
		int [][] family = new int [x][y];
		
		double total =0;
		
		for(int i=0; i<family.length; i++){
			for(int j=0;j<family[i].length;j++){
				
				System.out.print("Member "+(i+1)+" Month "+(j+1)+" income :");
				 family [i][j] = input.nextInt();
				 
				 total += family[i][j];
				 
				
				}
			
			System.out.println("avg "+total/y);
			
			
			}
		
		
	}
	
}
