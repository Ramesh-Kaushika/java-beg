class OOP1{
	
	public static void main (String [] args){
		
		Car c1 = new Car();
		c1.brand = "BMW";
		c1.color = "red";
		c1.engineCapacity = 20000;
		c1.manufactureDate = 2023;
		c1.topSpeed = 450.00;
		c1.auto = false;
		c1.AI();
		
		Car c2 = new Car();
		c2.brand = "Benze";
		c2.color = "Silver";
		c2.engineCapacity = 18000;
		c2.manufactureDate = 2021;
		c2.topSpeed = 230.00;
		c2.spoiler = true;
		c2.auto = false;
		
		}
	
	
	}
	
	class Car {
		String brand;
		String color;
		int engineCapacity;
		int manufactureDate;
		double topSpeed;
		boolean spoiler;
		boolean auto;
		
		public void AI() {} 
		
		
		
		
		}
