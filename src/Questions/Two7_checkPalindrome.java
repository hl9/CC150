package Questions;

import java.util.Stack;

public class Two7_checkPalindrome {
	class LinkedListNode {
		LinkedListNode next;
		char data;

		public LinkedListNode (char n) {
			next = null;
			data = n;
		}
	}

	// 'level'
	// p1 goes 1 node at a time, and add data into stack.
	// p2 goes 2 nodes at a time.
	// when p2 reaches end, p1 is at middle.
	// then pop elements from stack, and p1 continutes. compare elements from stack and p1
	boolean isPalindrome(LinkedListNode head) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		Stack<Character> s = new Stack<Character>();

		while (p2.next != null && p2 != null) {
			s.push(p1.data);
//			if (p2.next.next != null) {
			p2 = p2.next.next;
			p1 = p1.next;
//			} else {
//				break;
//			}
		}

		if (p2 != null) {
			p1 = p1.next; //middle point
		}
		// iterate p1 and compare to elements from stack
		while (p1.next != null) {
			if (p1.data == s.pop()) {
				p1 = p1.next;
			} else {
				return false;
			}
		}
		return true;
	}
}
