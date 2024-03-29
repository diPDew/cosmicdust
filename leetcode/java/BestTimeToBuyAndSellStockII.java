/**
 * Solution: As mentioned in the problem description, "You may complete as many transactions as you like."
 *   So we can solve this problem greedily. Specifically, if prices[i] > prices[i-1], buy stock at i-1 and 
 *   sell the stock immediately at i. 
 */

public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		
		int max = 0;
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] > prices[i-1]) {
				max += prices[i] - prices[i-1];
			}
		}
		return max;
	}
}