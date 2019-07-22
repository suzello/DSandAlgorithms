package com.sushanth.collections;

import java.util.Arrays;

public class Anagram {

	/*
	 * Step 1: Converting String to Char Array eg: arr1: [a,n,a,g,r,a,m] arr2:
	 * [n,a,g,a,r,a,m] Step 2: Sorting the Character Array arr1: [a,a,g,m,n,r] arr2:
	 * [a,a,g,m,n,r] Step 3: Generating the String from the Sorted Array s1 = aagmnr
	 * s2 = aagmnr Step 4: Chekcing the equality for the generated string if(s1 ==
	 * s2){return true;} else{return false}
	 */

	// Complete the makeAnagram function below.
	static boolean isAnagram(String a, String b) {

		// String firstString = a;
		// String secondString = b;

		char[] firstStringToChar = a.toCharArray();
		char[] secondStringToChar = b.toCharArray();
		Arrays.sort(firstStringToChar);
		Arrays.sort(secondStringToChar);

		String x = new String(firstStringToChar);
		String y = new String(secondStringToChar);

		if (x.equals(y)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}
}
