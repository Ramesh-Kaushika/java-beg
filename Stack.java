

class Student{
          
			int codec;
			String name ;
			String address;
			{
					
					System.out.println("Instance Block");
					
					
					}
			
			
			public Student(String name, String address,int codec){
				
				 this.codec=codec;
				this.name=name;
				this.address= address;
				System.out.println("Hello Constructer");
				
				}
				
					
					public Student(){
				
				 this.codec=codec;
				this.name=name;
				this.address= address;
				System.out.println("Hello Constructer-02");
				
				}
				{
					
					System.out.println("Instance Block-02");
					
					
					}
			
			public void learn(){
				display();
				System.out.println("Hello leran");
				}
			
			
			public static void display(){
				play();
				System.out.println("Hello display");
				}
				
				public static void play(){
					System.out.println("Hello play");
				
				}
			
				
	} 


class Stack{
	
		 public static void main(String args[]){
		 Student c1 = new Student();
			
			System.out.print(c1.name);
			
			Student.display();
			
			//display();
			
			Student c2 = new Student ("Ramesh","Horana",30);
			
			System.out.print(c2.name);
			System.out.print(c2.codec);
			
		//	
		//	
			

	} 
}
