package ds.array;
/*
 * Find the Number Occurring Odd Number of Times
Given an array of positive integers. All numbers occur even number of times except one number which occurs 
odd number of times. Find the number in O(n) time & constant space.

Example:
I/P = [1, 2, 3, 2, 3, 1, 3]
O/P = 3
 */

public class OddOccurence3 
{
	public static void main(String[] args)
	{
		int ar[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		System.out.println(oddOccur(ar));
		
	}
	
	// Simply xor all the elements.
	public static int oddOccur(int[] arr)
	{
		int res = 0;
		for(int i = 0; i < arr.length; i++)
		{
			res  = res ^ arr[i];
		}
		
		return res;
	}
}
