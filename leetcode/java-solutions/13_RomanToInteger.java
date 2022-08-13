import java.util.*;

/**
 * Given a roman numeral, convert it to an integer.
 *
 * @author Alejandro Medina (@alejmedinajr)
 *
 * Can be found at: https://leetcode.com/problems/roman-to-integer/
 */
class Solution {
	public int romanToInt(String s) {
		HashMap<Character, Integer> conversionMap = new HashMap<Character, Integer>(); // HashMap for Roman Numeral to Decimal conversion
		conversionMap.put('I', 1); // I converts to 1
		conversionMap.put('V', 5); // V converts to 5
		conversionMap.put('X', 10); // X converts to 10
		conversionMap.put('L', 50); // L converts to 50
		conversionMap.put('C', 100); // C converts to 100
		conversionMap.put('D', 500); // D converts to 500
		conversionMap.put('M', 1000); // M converts to 1000
		
		int result = conversionMap.get(s.charAt(s.length() - 1)); // start with last character value 
		
		for(int i = s.length() - 1; i > 0; i--){
			if(conversionMap.get(s.charAt(i)) <= conversionMap.get(s.charAt(i - 1))) result += conversionMap.get(s.charAt(i - 1)); 
			else result -= conversionMap.get(s.charAt(i - 1));      
		}
		
		return result;
	}
}