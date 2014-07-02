package Questions;
// Implement an algorithm to determine if a string has all unique characters.
// what if you cannot use additional data structure?

import java.util.*;
import java.util.Map.Entry;

public class One1a_unique_characters {
	
	public static boolean checkUniq(String str) {
		String ch; 
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i=0; i<str.length(); i++) {
			ch = str.substring(i, i+1);
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else {
				return false;
			}
		}
		return true;
	}

	public static HashMap<String, Integer> getCounts(String str) {
		String ch; 
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i=0; i<str.length(); i++) {
			ch = str.substring(i, i+1);
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else {
				hm.put(ch, hm.get(ch)+1);
			}
		}		
		return hm;
	}
	
	public static void printHashMap(HashMap<String, Integer> hm) {
		for (Entry<String, Integer> ent : hm.entrySet()) {
			System.out.println(ent.getKey() + " - " + ent.getValue());
		}
	}
	
	public static void main(String[] args) {
		String str = "absolutlllleeey";
		if (checkUniq(str)) {
			System.out.println(str + " is Uniq");
		} else {
			System.out.println(str + " is NOT Uniq");
		}
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm = getCounts(str);
		printHashMap(hm);
	}

}
