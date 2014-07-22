// 4.6 Write an algorithm to find the 'next node (i.e., in-order successor) of a given node in a binary search tree. 
//You may assume that each node has a link to its parent.

package Questions;

public class Four6_findBSTNextNode {

	class Node {
		int data;
		Node left;
		Node right;
		Node parent;

		public Node(int n) {
			data = n;
			left = null;
			right = null;
			parent = null;
		}
	}

	Node findNext(Node node) {
		if (node == null) return null;

		if (node.right != null) {
			// the very left end node on the right subtree
			Node n = node.right;
			while (n.left != null) {
				n = n.left;
			}
			return n;
		} else if (node.parent != null) {
			// if it's the left child of a parent, return the parent
			if (node == node.parent.left) { //if (node.data <= node.parent.data) {
				return node.parent;
			} else {
				// if it's the right child of a parent
				// keep looking till find the next node
				Node n = node;
				Node p = n.parent;
				while (p != null || n == p.right) {
						n = p;
						p = p.parent;
				}
				return p;
			}
		} else {
			return null;
		}
	}
}
