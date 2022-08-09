/**
 * Given an integer num, return the number of steps to reduce it to zero. 
 * In one step, if the current number is even, you have to divide it by 2, 
 * otherwise, you have to subtract 1 from it.
 * 
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
class Solution {
	public int numberOfSteps(int num) {
		int count = 0;
		while(num != 0) {
			if(num % 2 == 0) {
				num /= 2;//If it is an even number, divide by two
				count++;
			}
			else {
				num -= 1;//If it is an odd number, subtract one
				count++;
			}
		}
		return count;
	}
}
