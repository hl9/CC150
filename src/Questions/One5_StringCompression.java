package Questions;

public class One5_StringCompression {
	
	public static String stringCompression(String s) {
		String t = "";
		int counter = 1;
		char prevChar = s.charAt(0);
		
		for (int i = 0; i < s.length(); i++ ) {
			if (s.charAt(i) == prevChar) {
				counter++;
			} else {
				t = t + prevChar + counter;
				counter = 1;
				prevChar = s.charAt(i);
			}
		}
		t = t + prevChar + counter;
		
		System.out.println("T is " + t);
		if (t.length() > s.length()) {
			return s;
		} else {
			return t;
		}	
	}
	
	public static void main(String[] args) {
		String s = "aabcccccaaa";
		System.out.println(stringCompression(s));
	}
}
