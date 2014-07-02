package DataStructure;

public class trySelfieLinkedList {
	  class Node {
		    Node next = null;
				int data;
				
				public Node(int d) {
					data = d;
				}
				
				public void appendToTail(int n) {
					Node t = this;
					Node end = new Node(n);
					
					while (t.next != null) {
		        t = t.next;
		      }
		      t.next = end;
				}
				
				public Node deleteNote(Node head, int n) {
		      Node t = head;
		      
		      if (t.data == n) {
		        return t.next;
		      }
		      
		      Node nn = new Node(n);
		      
		      while (t.next != null ) {
		        if (t.next.data == nn.data) {
		          t.next = t.next.next;
		        } else {
		          t = t.next;
		        }
		      }
		      return head;
				}
		    
		  } 
}
