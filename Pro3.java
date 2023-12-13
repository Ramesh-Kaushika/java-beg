import java.util.*;

class Pro3{
	public static void main (String args []){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter Array Length : ");
		int arrayLength = input.nextInt();
		
		int num [] = new int [arrayLength];
		
		
		//Added Value in Array
		System.out.println();
		for(int  i = 0 ; i < num.length ; i ++){
			System.out.print("Enter Number : ");
			num[i] = input.nextInt();
		}
		
		//Print Value in Array
		System.out.println();
		for(int i=0; i < num.length ; i++ ){
			System.out.print(num[i]+" ");
		}
		
		//Print Large Value in Array
		System.out.println();
		int large = 0;
		for(int i = 0 ; i < num.length ; i++){
			if(large < num [i]){
				large = num[i];
			}
		}
		System.out.println("\nYour Large Number is : "+large);
		
		//Print Secand Large Value in Array
		System.out.println();
		int snLarge = 0 ;
		for(int i = 0 ; i < num.length ; i++){
			if(snLarge < num [i] & large > num [i]){
				snLarge = num[i];
			}
		}
	System.out.println("\nYour Secand Large Number is : "+snLarge);
		
	}
}
