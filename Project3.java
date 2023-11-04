import java.util.Scanner;

class Project3 {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("User's Name :- ");
		String userName = scan.next();
		
		System.out.println("Maths Subject :- ");
		int subMath = scan.nextInt();
		
		System.out.println("Physics Subject :- ");
		int subPhy = scan.nextInt();
		
		System.out.println("Chemistry Subject :- ");
		int subChem = scan.nextInt();
		
		
		double sum = (subMath+subPhy+subChem);
		System.out.println("Total Marks"+sum);
		
		double marksAvg = sum/3;
		System.out.println("Marks Average = "+marksAvg);
		
		
		
	if(marksAvg >= 75){
			
						System.out.println(userName+" A");
			
			}
		 else if(marksAvg >= 65){
			 
						System.out.println(userName+" B");
			
			}
			 else if(marksAvg >= 55){
			
						System.out.println(userName+" C");
			
			}
			 else if(marksAvg >= 35){
			
						System.out.println(userName+" S");
			
			}
			else{
			
						System.out.println(userName+"F");
			
			} 
		
		
		
		
		
	}
}
