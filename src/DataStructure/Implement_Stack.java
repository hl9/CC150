package DataStructure;

public class Implement_Stack {
	
	class Node {
		Node next;
		Object data;
		
		public Node(Object n) {
			next = null;
			data = n;
		}
	}
	
	class Stack {
		Node top;
		
		public Stack() {
			top = null;
		}
		
		void push(Object item) {
			Node node = new Node(item);
			node.next = top;
			top = node;
		}
		
		Object pop() {
			if ( top != null ) {
				Node t = top;
				top = t.next;
				return t.data;
			}  
			return null;
		}
		
		Object peek() {
			return top.data;
		}
	}
}
