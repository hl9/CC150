package Questions;

public class Two6_LinkedListLoop {
	// check if a linked list has loop
	// pointer p1 and p2. p1 irate through the list, p2 goes twice as fast.
	// if p1 and p2 meet, then ehere is a loop.
	// to check the position of the begining of the loop:
	// p1 goes back to head. both p1 and p2 move at regular speed.
	// the position they meet again is the beginning of the loop

	class LinkedListNode {
		LinkedListNode next;
		int data;

		public LinkedListNode(int n) {
			data = n;
		}
	}

	LinkedListNode findLoop(LinkedListNode head) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;

		while (p1.next != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				break;
			}
		}

		if (p2 == null || p2.next == null) {
			return null;
		}

		p1 = head;
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
