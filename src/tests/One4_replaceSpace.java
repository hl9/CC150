package tests;

public class One4_replaceSpace {

static void replaceSpace(char[] arr, int len) {
	int j = arr.length-1;
	for (int i=len-1; i>0; i--) {
		if (arr[i] != ' ') {
			arr[j--] = arr[i];
		} else {
			arr[j--] = '0';
			arr[j--] = '2';
			arr[j--] = '%';
		}
	}
	System.out.println(arr);
}

public static void main(String[] args) {
	String s1 = "Mr John Smith    ";
	char[] arr = s1.toCharArray();
	replaceSpace(arr, 13);
}
}
