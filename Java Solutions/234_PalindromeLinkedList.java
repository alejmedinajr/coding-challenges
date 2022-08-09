/**
 * Given the head of a singly linked list, return true if it is a palindrome. 
 * 
 * @author Alejandro Medina (@alejmedinajr)
 * 
 * Can be found at: https://leetcode.com/problems/palindrome-linked-list/
 */
public class Solution {
	private ListNode left = null;
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) return true; // an empty linked list or a linked list of size one is a palindrome
	
		left = head;
		
		return isP(head);
	}
	private boolean isP(ListNode right) {
		boolean result = null;
		
		if (right == null) return true;
		if (!isP(right.next)) return false;
		
		result = left.val == right.val;
		left = left.next;
		
		return result;
	}
}	