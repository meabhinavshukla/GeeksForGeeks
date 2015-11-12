package ds.array;

/*
 * Maximum profit by buying and selling a share at most twice
* In a daily share trading, a buyer buys shares in the morning and sells it on same day. If the trader is allowed 
* to make at most 2 transactions in a day, where as second transaction can only start after first one is complete 
* (Sell->buy->sell->buy). Given stock prices throughout day, find out maximum profit that a share trader could have made.
* 
* 
* We can do this O(n) using following Efficient Solution. The idea is to store maximum possible profit of every subarray 
* and solve the problem in following two phases.

1) Create a table profit[0..n-1] and initialize all values in it 0.

2) Traverse price[] from right to left and update profit[i] such that profit[i] stores maximum profit achievable from one 
   transaction in subarray price[i..n-1]

3) Traverse price[] from left to right and update profit[i] such that profit[i] stores maximum profit such that profit[i] 
   contains maximum achievable profit from two transactions in subarray price[0..i].

4) Return profit[n-1]
 */


public class MaxProfit132 
{
	public static void main(String[] args)
	{
		int price[] = {2, 30, 15, 10, 8, 25, 80};
	    System.out.println(maxProfit(price));
		
	}
	
	public static int maxProfit(int[] price)
	{
		int n = price.length;
		int[] profit = new int[n];
		
		int max = price[n-1];
		
		for(int i = n-2; i >= 0; i--)
		{
			if(price[i] > max)
				max = price[i];
			
			profit[i] = Math.max(profit[i+1], max - price[i]);
			
		}
		
		int min = price[0];
		
		for(int i = 1; i < n; i++)
		{
			if(price[i] < min)
				min = price[i];
			
			profit[i] = Math.max(profit[i-1], profit[i] + (price[i] - min));
								
		}
		return profit[n-1];
	}
}
