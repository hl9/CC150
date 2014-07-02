package Questions;

import java.util.Arrays;

//Implement an algorithm to determine if a string has all unique characters.
//* what if you cannot use additional data structure?

public class One1b_unique_character {

	public static boolean checkUniq (String str) {

		if (str.length()>128) return false;
		
		int ascii;
		
		boolean[] chars = new boolean[256];
		
		for (int i=0; i<str.length(); i++ ) {
			ascii = (int)str.charAt(i);
			if (chars[ascii]) {
				return false;
			} else {
				chars[ascii]=true;
			}
		}
		return true;

	}
	
	public static void main(String[] args) {
		String str = "absolutlllleeey";
		if (checkUniq(str)) {
			System.out.println(str + " is Uniq");
		} else {
			System.out.println(str + " is NOT Uniq");
		}
	}
}
