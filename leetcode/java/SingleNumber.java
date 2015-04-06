public class Solution {
	public int singleNumber(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		int val = A[0];
		for (int i = 1; i < A.length; ++i) {
			val ^= A[i];
		}
		return val;
	}
}