class OOP {
	
	public static void main (String [] args){
		//Java Object
		Student std1 = new Student();
		std1.name = "Ramesh";
		std1.address = "Mathugama";
		std1.age = 25;
		std1.salary = 25000;
		std1.isHaveCar = true;
		
		Student std2 = new Student();
		std2.name = "Kamal";
		std2.address = "Horana";
		std2.age = 35;
		std2.salary = 25000;
		std2.isHaveCar = false;
		std2.isHaveGf = false;
		
		
		
		}
	
	
	
	}
//Java Class
class Student{
	//attributes
	String name;
	String address;
	int age;
	boolean isHaveGf;
	boolean isHaveCar;
	double salary;
	String favFood;
	
	//behaviours
	public void play(){}
	
	public void learn(){}




}
