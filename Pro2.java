import java.util.*;

class Pro2{
	public static void main(String[]args){
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("How Many Elements Do You Want ");
		int x = input.nextInt();
		
		int [] elements = new int [x];
		
		for(int i=0; i<elements.length; i++){
		

		elements[i] = input.nextInt();
		
	   }
	   
	   		System.out.println(Arrays.toString(elements));
	   		Arrays.sort(elements);
	   		System.out.println(Arrays.toString(elements));
	   		
	   		int sMax;
	   		
		for(int i = 0; i<elements.length; i++ ){
         for(int j = i+1; j<elements.length; j++){

            if(elements[i]>elements[j]){
               sMax = elements[i];
               elements[i] = elements[j];
               elements[j] = sMax;
            }
         }
      }
      System.out.println("Third second largest number is:: "+elements[elements.length-2]);
   

				
		}
		
	}

