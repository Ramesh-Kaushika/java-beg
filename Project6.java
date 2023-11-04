import java.util.Scanner;

class Project6{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		/*
		
			System.out.println("Enter First Player Number :- ");
			int firstP = scan.nextInt();
			
			int equal = 0;
			
			for(int i=0; i<10; i++){
				
				System.out.println("second player enter number" +(i+1)+"-" );
				equal += scan.nextInt();
				
				}
				
			if(firstP==equal) {
				
				System.out.println("You Win");
				
				
				}
				
			else{
				
				System.out.println("You Lost");
				
				}			*/
				
				
			System.out.println("Enter First Player Number :- ");
			int firstP = scan.nextInt();
			int secondP = 0;
			
			for(int i=0; i<10; i++){
				
				System.out.println("second player enter number" +(i+1)+"-" );
				equal += scan.nextInt();
				secondP=scan.nextInt();
				
				}
				
			if(secondP<20) {
				
				System.out.println("You Win");
				
				
				}
		
	}
}
