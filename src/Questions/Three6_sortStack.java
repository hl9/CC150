package Questions;

import java.util.*;

public class Three6_sortStack {
	// sort a stack in ascending order

	static Stack<Integer> sortStack(Stack<Integer> s) {
		Stack<Integer> t = new Stack<Integer>();

		Integer tmp;

		if (s.isEmpty())  return null; 

		t.push(s.pop());

		while (!s.isEmpty()) {
			tmp = s.pop();
			if (tmp <= t.peek()) {
				t.push(tmp);
			} else {
				insertToS2(tmp, t, s);
			}
		}

		return t;
	}

	static void insertToS2(Integer x, Stack<Integer> s2, Stack<Integer> s1) {
		int cnt = 0;

		while (!s2.isEmpty() && s2.peek()<=x) {
			s1.push(s2.pop());
			cnt++;
		}

		s2.push(x);

		while(cnt>0) {
			s2.push(s1.pop());
			cnt--;
		}
	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(8);
		s1.push(9);
		s1.push(3);
		s1.push(5);
		s1.push(7);

		s2 = sortStack(s1);

		for (Integer i: s2)  {
			System.out.println(i);
		}
	}
}
