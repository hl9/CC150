package tests;

public class One5_compressString {
	static String compressString(String s) {
		int cnt;
		String s2 = "";
		char prev;

		prev = s.charAt(0);
		cnt = 1;

		for (int i=1; i<s.length(); i++) {
			if (s.charAt(i) == prev) {
				cnt ++;
			} else {
				s2 = s2 + prev + cnt;
				prev = s.charAt(i);
				cnt = 1;
			}
		}
		s2 = s2 + prev + cnt;
		
		if (s2.length() > s.length()) {
			return s;
		} else {
			return s2;
		}
	}
	
	public static void main(String[] args) {
		String s = "aabcccccaaa";
		System.out.println(compressString(s));
		
		s="abcdefageacges";
		System.out.println(compressString(s));
	}
}
