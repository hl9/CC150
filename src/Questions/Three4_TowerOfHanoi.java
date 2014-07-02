package Questions;

import java.util.*;

public class Three4_TowerOfHanoi {
	
	static void printStack(Stack<Integer> s, int n) {
		if (s.size() == 0) {
			System.out.println("Stack " + n + " is empty");
			return;
		}
//		Iterator itert = s.iterator();
//		while (itert.hasNext()) {
//			System.out.println(itert.toString());
//		}
		System.out.print("Stack " + n + " print: ");
		for (Integer i: s) {
			System.out.print(i + ", ");
		}
		System.out.println("");
	}

	static void hanoi(int n, Stack<Integer> s1, Stack<Integer> s3, Stack<Integer> s2) {
		if (n == 1) {
			s3.push(s1.pop());
//		} else if (n ==2 ) {
//			s2.push(s1.pop());
//			s3.push(s1.pop());
//			s3.push(s2.pop());
		} else {
			hanoi((n-1), s1, s2, s3);
			s3.push(s1.pop());
			hanoi((n-1), s2, s3, s1);
		}
		System.out.println("*************************");
		printStack(s1, 1);
		printStack(s2, 2);
		printStack(s3, 3);
	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();

		s1.push(5);
		s1.push(4);
		s1.push(3);
		s1.push(2);
		s1.push(1);
		
		System.out.println("*************************");
		printStack(s1, 1);
		printStack(s2, 2);
		printStack(s3, 3);
		
		hanoi(5, s1, s3, s2);
	}
}
