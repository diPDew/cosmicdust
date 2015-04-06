/**
 * Optimal comlexity:
 * 		Time: O(n)
 *		Space: O(1)
 *
 * Solution: At index i, record the minimal value which has appeared so far (from 0 to i-1).
 *   So the largest gain between prices[i] and previous values is prices[i] - min_so_far.
 *   Later, update min_so_far, if prices[i] < min_so_far. So min_so_far will still be the minimal
 *   at index i+1.
 *
 */
public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int max = 0;
		int min_so_far = prices[0];
		for (int i = 1; i < prices.length; ++i) {
			max = Math.max(max, prices[i]-min_so_far);
			min_so_far = Math.min(min_so_far, prices[i]);
		}
		return max;
	}
}