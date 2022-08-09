/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *  
 * If there are two middle nodes, return the second middle node.
 * 
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/middle-of-the-linked-list/
 */
class Solution { 
	public ListNode middleNode(ListNode head) { 
		ListNode midNode = head; 
		ListNode temp = head; 
		if(head.next == null) return head; 
 
		int count=1; 
		while(temp.next != null) {
			if(count % 2 == 1) {
				count++;
				temp = temp.next;
				midNode = midNode.next;
			}
			else {
				count++;
				temp = temp.next;
			}
		}
		return midNode;
	}
}
