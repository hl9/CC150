package tests;

public class One5_compressStringBuffer {

	static String compressString(String s) {
		StringBuffer sb = new StringBuffer();
		char prev = s.charAt(0);
		int cnt = 1;

		for (int i=1; i<s.length(); i++) {
			if (s.charAt(i) == prev) {
				cnt++;
			} else {
				sb.append(prev);
				sb.append(cnt);
				prev = s.charAt(i);
				cnt = 1;
			}
		}
		sb.append(prev);
		sb.append(cnt);

		return (sb.length()>s.length())?s:sb.toString();
	}
	
	public static void main(String[] args) {
		String s = "aabcccccaaa";
		System.out.println(compressString(s));
		
		s="abcdefageacges";
		System.out.println(compressString(s));
	}
}
