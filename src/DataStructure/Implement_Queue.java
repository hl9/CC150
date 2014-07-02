package DataStructure;

public class Implement_Queue {
	
	class Node {
		Object data;
		Node next;
		
		public Node(Object n) {
			data = n;
			next = null;
		}
	}
	
	class Queue {
		Node head;
		Node tail;
		
		public Queue() {
			head = null;
			tail = head ;
		}
		
		void enqueue(Object item) {
			if (head == null) {
				tail = new Node(item);
				head = tail;
			} else {
				Node t = new Node(item);
				tail.next = t;
				tail = t;
			}
		}
		
		Object dequeue() {
			if (head != null) {
				Node t = head;
				head = head.next;
				if (head == null) {
					tail = head;
				}
				return t.data;
			}
			return null;
		}
	}
}
