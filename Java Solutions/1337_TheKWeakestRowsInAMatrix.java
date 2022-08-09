/**
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). 
 * The soldiers are positioned in front of the civilians. That is, all the 1's will appear to 
 * the left of all the 0's in each row.
 *
 * A row i is weaker than a row j if one of the following is true:
 *
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 * 
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
class Solution {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[] ans = new int[k];
		int[][] candidates = new int[mat.length][2];

		for (int i = 0; i < mat.length; ++i) {
			candidates[i][0] = IntStream.of(mat[i]).sum();
			candidates[i][1] = i;
		}

		Arrays.sort(candidates, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

		for (int i = 0; i < k; ++i) ans[i] = candidates[i][1];

		return ans;
	}
}
