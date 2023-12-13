public class Oop2{
	
	public static void main(String [] args){
		
		Vehicle [] vehicle = new Vehicle[2];
		
		
		vehicle [0] = new Vehicle ();
		
		vehicle[0].brand = "Toyota";
 		vehicle[0].model = "Corolla";
 		vehicle[0].noOfTyres = 4;			
		
		//vehicle [0] = new Vehicle("BMW",true,12000.00);
		//vehicle [1] = new Vehicle("Toyota",3000.00);
		//vehicle [3] = new Vehicle("BMW",true,12000.00);
		
		for(int i=0; i<vehicle.length; i++){
			
			//vehicle[i]=new Vehicle("BMW",true,12000.00);
			System.out.println(vehicle[i]);
			
			
			}
		
		
		
	//	System.out.println(vehicle[1].model);
		//System.out.println(vehicle[1].engineCap);
	//	System.out.println(vehicle[1].isPowerMirror);
		

		
				}
	
	
	
	}
	
	
	
	class Vehicle {
		
		
		
		String brand;
		String model;
		int noOfTyres;
		boolean isPowerMirror;
		double engineCap;
		
	/*	public Vehicle(String model,boolean isPowerMirror,double engineCap){
			this.model=model;
			this.isPowerMirror=isPowerMirror;
		   this. engineCap= engineCap;
			
			
			
			}
			
			public Vehicle(String model,double engineCap){
			this.model=model;
		    this.engineCap= engineCap;
			
			
			
			}*/
		
		
		}
