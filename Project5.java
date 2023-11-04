import java.util.Scanner;

class Project5{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("User's Name   : ");
		String userName = scan.next();
		String userName1 = "name";
		
		
		
		System.out.println("User's Age    : ");
		int userAge = scan.nextInt();
		int userAge1 = 1234;
		
		
		
		System.out.println("User's Gender : ");
		String userGender = scan.next();
		String userGender1 = "gender";
		
		
		
		if(userAge<30 && userGender.equals ("male")){
			
			System.out.println(userName+" You are in Happy ");
			
			
			}
		else if(userAge>=30 && userGender.equals ("male")){
			
			
			
			System.out.println("User's Name   : ");
			
			
			}
		else if(userAge==40 && userGender.equals("Female")){
			
			
			System.out.println(userName+" You are in Happy ");
			
			
			}	
			
		else{
			
			
			System.out.println("You are in Normal Mode ");
			
			
			}	
		
		
		
		}
		
		
	}
