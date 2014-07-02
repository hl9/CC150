package Questions;

public class One5_good_BufferString_StringCompression {
	  public static void main(String[] args) {
//	     HashMap<String, String> map = new HashMap<String, String>();
//	     map.put("hello", "world");
//	     System.out.println("hello " + map.get("hello"));
	    String s = "aabcccccaaa";
	    System.out.println(stringCompression(s));
	  
	  }
	  
	  static String stringCompression(String s) {
	    
	    if (s.length() > countCompression(s)) {
	      return s;
	    }
	    
	    StringBuffer arr = new StringBuffer();
	    
	    char prevChar = s.charAt(0);
	    int counter = 1;
	    
	    for (int i=1; i<s.length(); i++) {
	      if (s.charAt(i) == prevChar) {
	        counter++;
	      } else {
	        arr.append(prevChar);
	        arr.append(counter);
	        counter = 1;
	        prevChar = s.charAt(i);
	      }
	    }
	    
	    arr.append(prevChar);
	    arr.append(counter);
	    
	    return arr.toString();
	  }
	  
	  // count the size of the compressed string
	  static int countCompression(String s) {
	    
	    int size=0;
	    
	    if (s.length() == 0) {
	      return 0;
	    }
	    
	    char prevChar = s.charAt(0);
	    int counter = 1;
	    
	    for (int i=1; i<s.length(); i++) {
	      if (s.charAt(i) == prevChar) {
	        counter++;
	      } else {
	        size += 1 + String.valueOf(counter).length();
	        counter = 1;
	      }
	    }
	    
	    size += 1 + String.valueOf(counter).length();
	    
	    return size;
	  }
	   
}
