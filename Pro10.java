class Pro10{
	

	
	public static void main(String [] args){
		
		Ramesh r1 = new Ramesh();
		
		r1.setId("C001");
		r1.setName("Yasindu");
		c1.setAge(26);
		//c1.email = "qbsdfn";
		//c1.income = 26000;
		
		System.out.println(r1.getId());
		System.out.println(r1.getName());
		
	  //  Customer c2 = new Customer();
	//	c2.setId ("C001");
	//	c2.name = "Yasindu";
	//	c2.age = 26;
	//	c2.email = "qbsdfn";
		//c2.income = 26000;
		
		
	//	Customer c3 = new Customer();
	/*	c3.setId ("C001");
		c3.name = "Yasindu";
		c3.age = 26;
		c3.email = "qbsdfn";
		c3.income = 26000;*/
		
		}
	}
class Ramesh{
		
		 String id;
		 String name;
		 int age;
		private String email;
		private double income;
		
		public void setId(String id){
			
			this.id=id;
			
			
			}
			
		public  String getId(){
				
				return id;
				
				}
			
		
		
	
	public void setName(String name){
			
			this.name=name;
			
			
			}
			
		public  String getName(){
				
				return name;
				
				}
			
		
		}
	
	
	

