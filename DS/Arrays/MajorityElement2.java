package ds.array;

/*
 * Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times 
 * (and hence there is at most one such element).

Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:

       I/P : 3 3 4 2 4 4 2 4 4
       O/P : 4 

       I/P : 3 3 4 2 4 4 2 4
       O/P : NONE
 */

public class MajorityElement2 
{
	public static void main(String[] args)
	{
		int a[] = {1, 3, 3, 1, 3, 3, 2};
	    printMajority(a);
		
	}
	
	/* Moore's voting algorithm
	* Basic idea of the algorithm is if we cancel out each occurrence of an element e with all the other elements 
	* that are different from e then e will exist till end if it is a majority element.
	*/
	public static int findCandidate(int[] arr)
	{
		//Initialize index and count of majority element
		int majorityElementIndex = 0, count = 1;
		
		//Loop for i = 1 to size – 1
		for(int i = 1; i < arr.length - 1; i++)
		{
			if(arr[majorityElementIndex] == arr[i])
				count++;
			else
				count--;
			
			if(count == 0)
			{
				majorityElementIndex = i;
				count = 1;
			}
			
		}
		return arr[majorityElementIndex];
	}
	
	public static void printMajority(int[] arr)
	{
	  // Get the candidate for the majority element using Moore's voting algorithm
		int majorityElement =  findCandidate(arr);
		
		// Initialize majority element occurence to 0.
		int occurence = 0;
		
		// Check if the occurence is greater than n/2, if yes print it and return else print none.
		for(int i =0; i < arr.length; i++)
		{
			if(arr[i] == majorityElement)
				occurence++;
			if(occurence > arr.length/2)
			{
				System.out.println(arr[i]);
				return;
			}
		}
		
		System.out.println("NONE");
	}
}
