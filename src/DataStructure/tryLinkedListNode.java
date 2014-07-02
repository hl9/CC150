package DataStructure;

public class tryLinkedListNode {
	class Node {
		Node next = null;
		int data;
		
		public Node(int d) {
			data = d;
		}
		
		void appendToTail(int d) {
			Node n = new Node(d);
			Node t = this;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		
		// return head Node of the linked list that has the Node deleted
		Node deleteNode (Node head, int d) {
			Node n = head;
			
			if (n.data == d) {
				return head.next;
			}
			
			while (n.next != null) {
				if (n.next.data == d) {
					n.next = n.next.next;
					return head;
				} 
				n = n.next; 
			}
			
			return head;
			
		}
	}
}
