package tests;

import java.util.*;

public class One3_isPermutation {

  static boolean isPermutation(String s1, String s2) {
	char[] a1 = s1.toCharArray();
	char[] a2 = s2.toCharArray();

//	a1.sort();
	Arrays.sort(a1);
	String s12 = new String(a1);
	
//	a2.sort();
	Arrays.sort(a2);
	String s22 = new String(a2);
	
	if(s12.equals(s22)) {
		return true;
	} else {
		return false;
	}
}

  static boolean isPermutation2 (String s1, String s2) {
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

	
	for (int i=0; i<s1.length(); i++) {
		if (hm.containsKey(s1.charAt(i))) {
			hm.put(s1.charAt(i), hm.get(s1.charAt(i)) + 1);
		} else {
			hm.put(s1.charAt(i), 1);
		}
	}

	for (int i=0; i<s2.length(); i++) {
		if (!hm.containsKey(s2.charAt(i))) {
			return false;
		} else if (hm.containsKey(s2.charAt(i))) {
			hm.put(s2.charAt(i), hm.get(s2.charAt(i))-1);
		}

		if (hm.get(s2.charAt(i)) == 0) {
			hm.remove(s2.charAt(i), hm.get(s2.charAt(i)));
		}
	}

	return true;
}

	public static void main(String[] args) {
		String s1 = "abcdefg";
		String s2 = "abcdegf";
		
		if (isPermutation(s1, s2)) {
			System.out.println("True method 1");
		} else {
			System.out.println("False method 1");
		}
		
		if (isPermutation2(s1, s2)) {
			System.out.println("True method 2");
		} else {
			System.out.println("False method 2");
		}
	}
}
