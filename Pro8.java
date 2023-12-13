import java.util.*;

public class Pro8{
	
	
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		
		double taxAdd = 0;
		double currentBalance = 90000;
		
		System.out.println();
		System.out.println("Daily Limit Has Run this ATM Over 1lak");
		
		System.out.println();
		
		System.out.println("----> Your Withdrawal Over 5000 Add 2% tax <--------- ");
		
		System.out.println();
		
		System.out.println("----> Your Withdrawal Over 5000 Add 2% tax <--------- ");
		System.out.println();
		
		System.out.print("Please Enter the Amount - ");
		int amount = input.nextInt();
		
		System.out.println();
		
		if(amount<100000){
			
			
		
		if(amount>=5000 && currentBalance>=amount){
			
			taxAdd = amount*2/100;
			System.out.println("tax is "+taxAdd);
			
			taxAdd = amount-amount*2/100;
			
			System.out.println("tax added "+taxAdd);
			System.out.println("collect Your Cash");
			
			}
			
			else{
				
				System.out.println("Insufficient Balance");
				System.out.print("Your Balance is "+currentBalance);
				
				}
		
		}
		
		else{
			
			System.out.print("You Can Not Withdrawel Daily Limit is 1lak");
			
			
			}
		
		}
	
	}
