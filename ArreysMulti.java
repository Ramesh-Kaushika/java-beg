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
		
/*		Random rn = new Random();
		
		int [] numeric = new int [10];
		
		for(int i=0; i<numeric.length; i++){
			 numeric [i] = rn.nextInt(100)+1;
			//int randomInput = rn.nextInt(100)+1;
			System.out.println(Arrays.toString(numeric));
			 
			
			}
			
			Arrays.sort(numeric);
			System.out.println("Sorted numeric array : " + Arrays.toString(numeric));
		
		
		
		
		
		int [][] numbers = new int [7][4];
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[i].length; i++){
				
				System.out.print(i+"----"+j+"--");
				numbers[i][j] = input.nextInt();
				
				
				
				}
			
			
			
			
			}
		
		*/
		
	//	int[][] a = new int[10][10];    
        
        // Use nested loops to iterate over each row and column of the array.
       // for (int i = 0; i < 10; i++) {
       //     for (int j = 0; j < 10; j++) {
                // Print each element of the array, ensuring a minimum width of 2 characters.
               //System.out.println(j);
             
           //  a [i][j] = input.nextInt();
            // System.out.println(i+" "+j+"");
             
             // System.out.println(j);
          //  }
            // Move to the next line to represent a new row in the output.
           // System.out.println(a);
          // a [i][0] = input.nextInt();
            
      //  }
		
		
		//System.out.print("Enter number ")
		//int number = input.nextInt();
		
		for(int i=0; i<10; i++){
			

			
			System.out.println("2 x "+(i+1)+" = "+(1+i)*2);
			
			}

		
	}
}
