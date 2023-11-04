import java.util.Scanner;

class Project7{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		String dbEmail = "admin@gmail.com";
		
		int dbPassword = 1234;
		
		
		for(int i=0; i<10; i++){
			
			System.out.println("Enter your email");
			String email = scan.next();
			
			System.out.println("Enter your Password");
			int password = scan.nextInt();
			
			
			
			
			
		if(email.equals("admin@gmail.com") && dbPassword == password){
		
			
				System.out.println("lOGIN SUCCESS");	
			
			
			
		break;
	}
		else{
			
			System.out.println("lOGIN FAILD");
			
			
			}
			
		if (i==4){
			
			System.out.println("5 Attemps");
			
			}
			
		 else if(i==9){
			
			System.out.println("Account Loged");
			
			}
		break;
			
	
			
		
	}
		
		
	}
}
