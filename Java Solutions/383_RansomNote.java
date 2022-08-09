/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed 
 * by using the letters from magazine and false otherwise. Each letter in magazine can only 
 * be used once in ransomNote.
 *
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/ransom-note/
 */
class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		boolean result = true;
		int[] count = new int[128];

		for(final char c : magazine.toCharArray()) ++count[c];

		for (final char c : ransomNote.toCharArray()) {
			if (--count[c] < 0) result = false;
		}
		return result;
	}
}