/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of  
 * money the ith​​​​​​​​​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. 
 * The richest customer is the customer that has the maximum wealth.
 *
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/richest-customer-wealth/
 */
class Solution {
	public int maximumWealth(int[][] accounts) {
		int wealth = -1;
		for(int i = 0; i < accounts.length; i++) {
			int temp_sum = 0;
			
			for(int j = 0; j < accounts[i].length; j++) temp_sum += accounts[i][j];
			
			if(temp_sum > wealth) wealth = temp_sum;
		}
		return wealth;
	}
}
