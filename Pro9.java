import java.util.Scanner;

public class Pro9{
public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
	Vehicle [] vehicle=new Vehicle[2];
	
	
	
	for(int i=0;i<vehicle.length;i++){
		
		
		
		
		System.out.print("Enter brand :");
		String brand =input.next();
		System.out.print("Enter model :");
		String model=input.next();
		System.out.print("Enter capacity :");
		int capacity=input.nextInt();
		
		
		
		vehicle[i] = new Vehicle( brand,model,capacity);
		
	      
	      
		
		
		}
		
	vehicle [1].display();
	
	}
}

class Vehicle{
	
	String brand;
	String model;
	int capacity;
	
	
	
	
	public Vehicle(String brand,String model,int capacity){
		
		this.brand = brand;
	    this.model = model;
	    this.capacity = capacity;
	  System.out.print(brand);
	
		}
		
		public void display(){
			
			//Vehicle();
			
			
			}
}
