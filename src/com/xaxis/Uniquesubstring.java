package com.xaxis;

public class Uniquesubstring {
	/*static*/ public int longestSubstringss(String s) {
		boolean[] exist = new boolean[100];
		int i = 0, maxLen = 0;
		for(int j = 0; j < s.length(); j++) {
			while(exist[s.charAt(j)]) {
				exist[s.charAt(i)] = false;
				i++;
			}
			exist[s.charAt(j)] = true;
			maxLen = Math.max(maxLen, j - i + 1);
		}
		return maxLen;
	}
	/*if want to open main, uncomment static block from above method
	 * public static void main(String[] args) {
		String targetString = "bbbbb";

		System.out.println(longestSubstringss(targetString));
	} */   
}
