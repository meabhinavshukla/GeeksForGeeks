package ds.array;

import java.util.Arrays;

/* Pythagorean Triplet in an array
Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.

Example:

Input: arr[] = {3, 1, 4, 6, 5}
Output: True
There is a Pythagorean triplet (3, 4, 5).

Input: arr[] = {10, 4, 6, 12, 5}
Output: False
There is no Pythagorean triplet.
*/

public class PythagoreanTriplet131 
{
	public static void main(String[] args)
	{
		int arr[] =  {10, 4, 6, 12, 5} ;
	    System.out.println(isTriplet(arr));
		
	}
	
	public static boolean isTriplet(int arr[])
	{
		Arrays.sort(arr);
		int n = arr.length;
		for(int i : arr)
		{
			i*=i;
		}
				
		for(int i = 0; i < n-2; i++)
		{
			
			int l = i+1; 
			int r = n-1;
			
			while(l<r)
			{
				if(arr[l] + arr[i] == arr[r])
					return true;
				else if(arr[l] + arr[i] < arr[r])
					l++;
				else
					r--;
			}
			
			
		}
		
		return false;
	}
}
