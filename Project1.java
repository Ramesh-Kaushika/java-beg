import java.util.Scanner;

class Project1 {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
	  System.out.print("This is a programing training ");
		System.out.println("training institute ");
		System.out.print("and I am enrolled ");
		System.out.println("with it.");
		
	/*	int num1 = 10;
		int num2 = 20;
		
		int sum = (num1+num2);
		System.out.println(sum);
		
		System.out.print("Enter Numeber = ");
		int num3 = scan.nextInt();
		System.out.println(num3);
		
		System.out.print("Enter Numeber2 = ");
		int num4 = scan.nextInt();
		System.out.println(num4);
		
		int sum2 = num3+num4;
		System.out.print("Total = "+sum2);			*/
								
		
   /*     double data1 = 67.1;
		
		System.out.println(6+7);
		System.out.println("6"+"7");
		System.out.println("Total = "+data1);		*/	
		
	/*	System.out.print("Enter First Sub = ");
		double sub1 = scan.nextDouble();
		
		
		System.out.print("Enter Second Sub = ");
		double sub2 =scan.nextDouble();
		
		System.out.print("Enter Third Sub = ");
		double sub3 = scan.nextDouble();
	
		
		double totalSub = sub1+sub2+sub3;
		System.out.println("Total = "+totalSub);		*/
		
		
		System.out.print("User Name :- ");
		String userName = scan.next();
		
		System.out.print("First Month Salary  = ");
		double sal1 = scan.nextDouble();
		
		System.out.print("Second Month Salary = ");
		double sal2 = scan.nextDouble();
		
		System.out.print("Third Month Salary  = ");
		double sal3 = scan.nextDouble();
		
		double salAvg = (sal1+sal2+sal3)/3;
		System.out.println("Ramesh's Average Salary is "+salAvg);
		
		double newAvg = salAvg - 5000;
		System.out.print("Ramesh's Average New Salary is "+newAvg);
		
		
		
		
		
		}
	
	
	
}
