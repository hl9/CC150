package Questions;
// You have two very large binary trees: T1, with millions of nodes, and T2, with hundres of nodes. 
// Create an algorithm to decide if T2 is a subtree of T1.

public class Four8_isSubTree {

	class Node{
		int data;
		Node left;
		Node right;

		public Node(int n) {
			data = n;
			left = null;
			right = null;
		}
	}

	boolean isSubTree(Node t1, Node t2) {
		if (t2 == null) return true;
		if (t1 == null) return false;

		if (t1.data == t2.data) {
			return matchTree(t1, t2);
		} else {
			return (isSubTree(t1.left, t2) || isSubTree(t1.right, t2));
		}
	}

	boolean matchTree(Node t1, Node t2) {
		if ((t1 == null && t2 != null) || (t1 != null && t2 == null) || (t1.data != t2.data)) {
			return false;
		} else if (t1 == null && t2 == null) {
			return true;
		} else {
			return (matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right));
		}
	}
}
