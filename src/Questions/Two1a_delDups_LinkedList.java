package Questions;

import java.util.*;

public class Two1a_delDups_LinkedList {
	  void removeDupsLinkedList(LinkedListNode n) {
		    HashSet<Integer> hs = new HashSet<Integer>();
		    LinkedListNode prev = null;
		    
		    while (n != null) {
		      if (hs.contains(n.data)) {
		        prev.next = n.next;
		      } else {
		        hs.add(n.data);
		        prev = n;
		      }
		      n = n.next;
		    }
		  }
		  
		  class LinkedListNode {
		    int data;
		    LinkedListNode next = null;
		    
		    public LinkedListNode(int d) {
		      data = d;
		    }
		  }
}
