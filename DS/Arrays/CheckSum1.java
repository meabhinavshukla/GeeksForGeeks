package ds.array;

import java.util.HashSet;

/*
 * Given an array A[] and a number x, check for pair in A[] with sum as x
Write a JAVA program that, given an array A[] of n numbers and another number x, 
determines whether or not there exist two elements in S whose sum is exactly x.
 */
public class CheckSum1 
{
	public static void main(String[] args)
	{
		int A[] = {1, 4, 45, 6, 10, 8};
        int n = 17;
        System.out.println(hasSum(A, n));
		
	}
	
	public static boolean hasSum(int[] arr, int sum)
	{
		HashSet<Integer> elements = new HashSet<Integer>();
		for(int i = 0; i < arr.length; i++)
		{
			if(elements.contains(sum - arr[i]))
				return true;
			else
				elements.add(arr[i]);
		}
		
		return false;
	}
}


