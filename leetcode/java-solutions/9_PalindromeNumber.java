/**
 * Given an integer x, return true if x is palindrome integer. 
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is a palindrome while 123 is not.
 *
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/palindrome-number/submissions/
 */
class Solution {
	public boolean isPalindrome(int x) {
		boolean result = true; // assume palindrome until proven otherwise
		String num = String.valueOf(x); // convert int x to a string 
		String lhs = num.substring(0, num.length()/2); // left half of the word
		String rhs = num.substring(num.length()/2, num.length()); // right half of the word
		int i = 0; // index for lhs, starts at beginning
		int j = rhs.length() - 1; // index for rhs, starts at end
		while(i != lhs.length() && result){
			if(lhs.charAt(i) != rhs.charAt(j)) { // lhs and rhs are no longer the same: not palindrome
				result = false;  
			} else {
				i++; // still a palindrome, increase i
				j--; // still a palindrome, decrease j
			}
		}
		return result;    
	}
}