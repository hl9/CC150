package Questions;

// Given class isSubstring
// check if s2 is a rotation of s1.
// example: s1 = waterbottle
// s2 = erbottlewat
// s1s1 = waterbottlewatterbottle
public class One8_isSubstring_check_rotation {
	boolean isSubstring(String s1, String s2) {
		return s1.contains(s2);
	}
	
	boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		
		String s1s1 = s1 + s1;
		return isSubstring(s1s1, s2);
	}
}
