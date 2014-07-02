package Questions;
// Given 2 strings, write a method to decide is one is a permutation of the other
// A: Build array, sort, and compare strings from arrays.
// B: Get counts of each character in array. compare counts

import java.util.*;

public class One3a_2Strings_permutation {
	
	public static boolean methodA (String s, String t) {
		
		if (s.length() != t.length()) {
			return false;
		}
		
		char[] arrS = s.toCharArray();
		char[] arrT = t.toCharArray();
		Arrays.sort(arrS);
		Arrays.sort(arrT);
		
		String s2 = new String(arrS);
		String t2 = new String(arrT);
		
		return s2.equals(t2);
	}
	
	public static boolean methodB (String s, String t) {
		
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] arr = new int[256];
		Arrays.fill(arr, 0);
		
		for (int i=0; i<s.length(); i++) {
			int c = s.charAt(i);
			arr[c]++;
		}
		
		for (int i=0; i<t.length(); i++) {
			int c = t.charAt(i);
			if (--arr[c] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s = "asdfqwerasdfqwer";
		String t = "qwerasdfasdfqwwr";
		
		if (methodA(s, t)) {
			System.out.println("Method A says Yes");
		} else {
			System.out.println("Method A says No");
		}
		
		if (methodB(s, t)) {
			System.out.println("Method B says Yes");
		} else {
			System.out.println("Method B says No");
		}
	}
}
