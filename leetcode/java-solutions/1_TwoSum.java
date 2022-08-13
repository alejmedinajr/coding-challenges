/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/two-sum/
 */
class Solution {
	public int[] twoSum(int[] nums, int target) {
		boolean done = false; 
		int[] result = new int[2];
		int i = 0; // start index i at the beginning
		int j = 1; // start index j 1 after index i
		while(!done){
			if(nums[i] + nums[j] == target){ // the two sums add up to target
				done = true;
				result[0] = i;
				result[1] = j;
			} else {
				if(j == nums.length - 1){ // if we reached the end, increase i while making sure j increases appropriately
					i++;
					j = i + 1;
				} else { // do not increase i yet but increase j
					j++;   
				}
			}
		}
		return result; 
	}
}