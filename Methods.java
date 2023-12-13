import java.util.*;

public class Methods{
	
	
	public static boolean confirmCouple(String bName,String gName){
		
		char boyF = bName.charAt(0);
		
		char girlF = gName.charAt(0);
		
		if (boyF==girlF){
			
			System.out.print("matching");
			return true;
			
			}
			
			else {
				
				System.out.print("No matching ");
			    return false ;
				
				}
				
}
	
	
	
	public static void main (String [] args){
	
	Scanner input = new Scanner (System.in);
	

	
	
	System.out.print("Enter Boy Name -: ");
	String bName = input.next();
	System.out.print("Enter Girl Name -: ");
	String gName = input.next();
	
	
	
	boolean t = confirmCouple(bName,gName);
	
	System.out.print("compare"+t);
	
	}
}
	
		
			
	
			

