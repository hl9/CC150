package tests;

import java.util.*;

public class One1_isUnique {
//	use HashMap
	static boolean isUnique1(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i=0; i<s.length(); i++) {
			if (hm.containsKey(s.charAt(i)))  {
				return false;
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		return true;
	}

//	use HashSet
	static boolean isUnique2(String s) {
		HashSet<Character> hs = new HashSet<Character>();
		
		for (int i=0; i<s.length(); i++) {
			if (hs.contains(s.charAt(i))) {
				return false;
			} else {
				hs.add(s.charAt(i));
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxyaz";
		if (isUnique1(s)) {
			System.out.println("1: true");
		} else {
			System.out.println("1: false");
		}
		
		if (isUnique2(s)) {
			System.out.println("2: true");
		} else {
			System.out.println("2: false");
		}
		
	}

}

