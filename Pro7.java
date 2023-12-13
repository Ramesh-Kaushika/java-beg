import java.util.*;

public class Pro7{
	
	public static int [] reverseArr(int [] arr){
		
		int[] newArr = new int[arr.length];
		
		for(int i=newArr.length-1; i>=0; i--){
				
				newArr[arr.length-1-i] = arr[i];
				
				}
				
		return newArr;
		
		}
		
	public static int sum1(int [] reversedArr){
		
		int sum=0;
		for(int i=0; i<reversedArr.length; i++){
		sum += reversedArr[i];
		
		
	}
		return sum;
		
		}
	
	public static int maximum(int [] reversedArr){
		
		int maximumNumber = reversedArr[0];
		
		for(int i=0; i<reversedArr.length; i++){
			
		if (reversedArr[i] > maximumNumber){
			
			maximumNumber = reversedArr[i];
			
			
				}
				
		
			}
		
	return maximumNumber;
	
    }
	
	public static int minimum(int [] reversedArr){
		
		int minimumNumber = reversedArr[0];
		
		for(int i=0; i<reversedArr.length; i++){
			
		if (reversedArr[i] < minimumNumber){
			
			minimumNumber = reversedArr[i];
			
			
				}
		
		}
		
		return minimumNumber;
		
	}
	
	public static int [] findEven(int []reversedArr){
		
		int evenNumber = 0;
		int count = 0;
	
		int [] evenNew = new int [reversedArr.length];
		
		for(int i=0; i<reversedArr.length; i++){

		      	if(reversedArr[i]%2==0){
					
					evenNew[count] = reversedArr[i];
					
					evenNumber++;
					count++;
					
					
					
			}
		
		}
		
		
		System.out.print ("Count "+count);
		System.out.println ();
	
	
	return  evenNew;
	
}
	public static int [] findOdd(int []reversedArr){
		
		int oddNumber = 0;
		int oddCount = 0;
		
		int [] oddNew = new int [reversedArr.length];
		
		for(int i=0; i<reversedArr.length; i++){

		      	if(reversedArr[i]%2==1){
					
					oddNew[oddCount] = reversedArr[i];
					
					oddNumber++;
					oddCount++;
					
					
					oddNew[i] = reversedArr[i];

			}
		
		}
		System.out.print("Odd Count "+oddCount);
		System.out.println();
		
		return  oddNew;
		
	}
	
	
	
	public static void main (String [] args){
		
		int [] arr = new int [12];
		
		Random rand = new Random();
		int upperbound = 100;
		
		
		for(int i=0; i<arr.length; i++){
			
			arr[i] = rand.nextInt(upperbound);
			
			
			}
			System.out.println(Arrays.toString(arr));
			
			 int []  reversedArr = reverseArr(arr);
			
			System.out.println(Arrays.toString(reversedArr));
			
			
			int sum = sum1(reversedArr);
			
			
			System.out.println(sum);
			
			int maximumNumber = maximum(reversedArr);
			
			System.out.println(maximumNumber);


			int minimumNumber = minimum(reversedArr);
				
			System.out.println(minimumNumber);
			
			int [] evenNew = findEven(reversedArr);
			
			System.out.println(Arrays.toString(evenNew));
			
			
			int [] oddNew = findOdd(reversedArr);
			
			System.out.println(Arrays.toString(oddNew));
			
			

		
	}		
				
}
