import java.util.Scanner;
import java.util.Random; 
import java.util.Arrays;

public class ArreysMulti{
	
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
/*	
	int [][] numbers = new int [5][3];
	
	for(int i=0; i<5; i++){
		for(int j=0; j<3; j++){
			
			System.out.print("["+numbers[i]+","+numbers[j]+"]");
			
			}
		
		
		} */
		
		Random rn = new Random();
		
		int [] numeric = new int [10];
		
		for(int i=0; i<numeric.length; i++){
			 numeric [i] = rn.nextInt(100)+1;
			//int randomInput = rn.nextInt(100)+1;
			System.out.println(Arrays.toString(numeric));
			 
			
			}
			
			Arrays.sort(numeric);
			System.out.println("Sorted numeric array : " + Arrays.toString(numeric));
		
		
		
		
		
		
		
		
		
	
	}
}
