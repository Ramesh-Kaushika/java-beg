import java.util.Scanner;

class Loop{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
	/*	for(int i=0; i<5; i++){
			
			System.out.println("Loop Five Times");
			
			}	*/
			/*
			
			System.out.print("Enter mark 01 :- ");
			int mark = scan.nextInt();
			
			System.out.print("Enter mark 02 :- ");
			int mark1 = scan.nextInt();
			
			System.out.print("Enter mark 03 :- ");
			int mark2 = scan.nextInt();
			
			System.out.print("Enter mark 04 :- ");
			int mark3 = scan.nextInt();
			
			System.out.print("Enter mark 05 :- ");
			int mark4 = scan.nextInt();
			
			int sum=mark+mark1+mark2+mark3+mark4;
			
			System.out.println("Total mark "+sum);
			
			int sum1=0;
			
			for(int i=0; i<5; i++){
				
				System.out.print("Enter mark"+(i+1)+":");
				sum1 += scan.nextInt(); // sum1 = sum1+scan.nextInt();
				
				
				
				}
				
				System.out.println("sum 1 is " +sum1);
				*/
				
			//While loop
			
			//true,false, a stament that generate true or false 
			
			int x = 42;
			
			while (x<50){
				
				System.out.println("Hello");
				if (x==45){
					
					break;
					
					}
				
				x++;
				
				}	
		//---------------------------------------------------
				
				int z = 4;
				
				do{
					
					System.out.println("Ramesh");
					z++;
					
					}
					
				while(x>=0);
				
//------------------------------------------------------------
					
					boolean isLoading = true;
					int data_Count = 5;
					
				while(isLoading){
					
					System.out.println("Ramesh");
					
					if(data_Count<=0){
						
						isLoading=false;
						
						}
						data_Count--;
					
					}
			
		}
	}	
