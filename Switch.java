import java.util.Scanner;

class Switch{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Lagna :- ");
		String lagna = scan.next();
		
		switch(lagna){
			case"wushchika":
			System.out.println("Gonussa");
			break;
			
			case"Danu":
			System.out.println("Iithalaya");
			break;
			
			case"Makara":
			System.out.println("Yaka");
			break;
			
			case"Kumba":
			System.out.println("Muttiya");
			break;
			
			case"Meena":
			System.out.println("Maluawa");
			break;
			
			case"Mesha":
			System.out.println("Gona");
			break;
			
			case"Wushaba":
			System.out.println("Haraka");
			break;
			
			case"Mithuna":
			System.out.println("Minissu");
			break;
			
			case"Kataka":
			System.out.println("Anaconda");
			break;
			
			case"Singha":
			System.out.println("Sinhaya");
			break;
			
			case"Kanya":
			System.out.println("Gonussa");
			break;
			
			case"Thula":
			System.out.println("Gonussa");
			break;
			
			default:
			System.out.println("No Lagna");
			
			
			
			
			}
	}
}
