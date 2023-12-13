import java.util.*;

class Kuppiya2{
	
	public static void add(int x,int y){
	
				int total = x+y;
				System.out.print("Addition "+total);
	
}
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number 1 -:  " );
		double numberOne = input.nextDouble();
		
		System.out.print("Enter Number 2 -:  " );
		double numberTwo = input.nextDouble();
		
		int [] q = new int [4];
		
		q[0] =A.addition;
		q[1] =B.Subtraction;
		q[2] =C.Division;
		q[3] =D.Multiplication;
		
		System.out.print(q);
		
		System.out.print("Select the Equation ");
		char letter = input.nextInt();
		
		switch(letter){
			
			case 'A' :
				add(numberOne,numberTwo);
			break;
			
			case 'B' :
				sub();
			break;
			
			case 'C' :
				dev();
			break;
			
			case 'D' : 
				multi();
			break;
			

			default:
			    Sytem.out.println("wrong letter");
			
			
			
			}
		
	}
	
}
