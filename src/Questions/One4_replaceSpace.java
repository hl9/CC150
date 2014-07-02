package Questions;
//replace all spaces in a string with '%20';

public class One4_replaceSpace {
	public static String convert(String s, int count) {
		char[] t;
		
		//count spaces in s
		int spaceCount = 0;
		for (int i=0; i<count; i++) {
			if (s.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		t = new char[count+spaceCount*2];
		
		int j = t.length-1;
		for (int i=count-1; i>=0; i--) {
			if (s.substring(i,i+1).equals(" ")) {
				t[j--] = '0';
				t[j--] = '2';
				t[j--] = '%';
			} else {
				t[j--] = s.charAt(i);
			}
		}
		
		String ts =  new String(t);
		return ts;
	}
	
	public static void main(String[] args) {
		String s = "Mr John Smith       ";
		System.out.println(convert(s, 13));
//		System.out.println(s.substring(0, 2));
//		System.out.println(s.substring(1,1));
	}
}
