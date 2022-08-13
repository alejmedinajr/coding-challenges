/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/length-of-last-word/
 */
class Solution {
	public int lengthOfLastWord(String s) {
		int result = 0;
		Scanner scan = new Scanner(s); // scanner to get last token of string s
		String lastWord = "";
		while(scan.hasNext()){
			lastWord = scan.next(); // consume tokens, we only care about the last word.
		}
		result = lastWord.length();
		return result;
	}
}