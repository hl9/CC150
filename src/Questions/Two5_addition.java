package Questions;

public class Two5_addition {
	//addition for linked list
	// (7->1->6) + (5->9->2) = (2->1->9)
	// 617 + 592 = 912

    static class LinkedListNode {
		LinkedListNode next;
		int data;

		public LinkedListNode(int n) {
			next = null;
			data = n;
		}
	}

	static LinkedListNode sumEasy(LinkedListNode h1, LinkedListNode h2) {
		int additional = 0;
		LinkedListNode sum;

		sum = new LinkedListNode(0);
		LinkedListNode n = sum;

		while (h1 != null & h2 != null) {
			if ((h1.data + h2.data) < 10 ) {
				sum.data = h1.data + h2.data + additional;
				additional = 0;
			} else {
				sum.data = h1.data + h2.data + additional - 10;
				additional = 1;
			}
			h1 = h1.next;
			h2 = h2.next;
			if (h1 != null || h2 != null) {
				sum.next = new LinkedListNode(0);
				sum = sum.next;
			}
		}

		while (h1 != null) {
			sum = h1;
		}

		while (h2 != null) {
			sum = h2;
		}

		return n;
	}
	
	static LinkedListNode sumRecurse(LinkedListNode l1, LinkedListNode l2, int carry) {
		LinkedListNode sum = new LinkedListNode(0);
		
		int value = 0;
		
		if (l1 == null && l2 == null) {
			return null;
		}

		if (l1 != null) {
			value += l1.data;
		}
		
		if (l2 != null) {
			value += l2.data;
		}
		
		value += carry;
		
		sum.data = value % 10;
		LinkedListNode more = sumRecurse(
				(l1==null)? null:l1.next, 
				(l2==null)?null:l2.next, 
				(value>=10)?1:0
		);
		sum.next = more;
		
		return sum;
	}
	
	public static void main(String[] args) {
		LinkedListNode l1 = new LinkedListNode(7);
		LinkedListNode l2 = new LinkedListNode(5);
		
		l1.next = new LinkedListNode(1);
		l1.next.next = new LinkedListNode(6);
		
		l2.next = new LinkedListNode(9);
		l2.next.next = new LinkedListNode(2);
		
//		LinkedListNode sum = sumEasy(l1, l2);
		LinkedListNode sum = sumRecurse(l1, l2, 0);
		while (sum != null) {
			System.out.print(sum.data + " -> ");
			sum = sum.next;
		}
	}
}
