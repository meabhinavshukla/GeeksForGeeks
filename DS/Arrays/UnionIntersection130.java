/*
*Find Union and Intersection of two unsorted arrays
Given two unsorted arrays that represent two sets (elements in every array are distinct), find union and intersection of two arrays.

For example, if the input arrays are:
arr1[] = {7, 1, 5, 2, 3, 6}
arr2[] = {3, 8, 6, 20, 7}
Then your program should print Union as {1, 2, 3, 5, 6, 7, 8, 20} and Intersection as {3, 6}. Note that the elements of union and 
intersection can be printed in any order.*/

package ds.array;

import java.util.HashSet;

public class UnionIntersection130 
{
	public static void main(String[] args)
	{
		int arr[] =  {10, 4, 6, 12, 5} ;
	    printUnion(arr);
	    printIntersection(arr);
		
	}
	
	public static void printUnion(int[] arr)
	{
		System.out.println("Union");
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i : arr)
		{
			hs.add(i);
		}
		for(int i : hs)
		{
			System.out.print(i+ " ");
		}
	}
	
	public static void printIntersection(int[] arr)
	{
		System.out.println("\nIntersection");
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i : arr)
		{
			hs.add(i);
		}
		for(int i : hs)
		{
			if(hs.contains(i))
			System.out.print(i+" ");
		}
		
	}
}
