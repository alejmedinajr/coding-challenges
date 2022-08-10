/**
 * You are given a non-negative integer array nums. In one operation, you must:
 * Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
 * Subtract x from every positive element in nums.
 * Return the minimum number of operations to make every element in nums equal to 0.
 *
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/
 */
class Solution {
	public int minimumOperations(int[] nums) {
		int numOperations = 0;
		boolean done = false;

		while(!done) {
			int min = 1000;

			for(int n: nums){
				if(n != 0) {
					min = Math.min(min, n);
				}
			}
			boolean enteredChange = false;
			for(int i = 0; i < nums.length; i++){
				if(nums[i] != 0) {
					enteredChange = true;
					nums[i] -= min;   
				}
			}

			int sum = 0;
			for(int n: nums) {
				sum += n;       
			}

			done = (sum == 0);
			if(enteredChange) numOperations++;

		}
		return numOperations;
	}
}