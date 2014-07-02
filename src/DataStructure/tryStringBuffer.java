package DataStructure;

public class tryStringBuffer {
	public static String joinStrings(String[] words) {
		StringBuffer sb = new StringBuffer();
		for (String str : words) {
			sb.append(str);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String[] words = new String[3];
		
		words[0] = "I";
		words[1] = "am";
		words[2] = "cool";
		
		String outstr = joinStrings(words);
		
		System.out.println(outstr);
	}
}
