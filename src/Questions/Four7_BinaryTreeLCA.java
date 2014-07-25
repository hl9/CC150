package Questions;
// Design an algorithm and write code to find the first common ancestor of two nodes n a binary tree. 
// Avoid storing additional nodes in a data structure. 
// Note: Thi sis not necessarily a binary search tree.

public class Four7_BinaryTreeLCA {

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int n) {
			data = n;
			left = null;
			right = null;
		}
	}

	// Method 1:
	Node findFCA(Node root, Node p, Node q) {
		if (root == null) return null;
		if (root == p || root == q) return root;

		boolean is_p_on_left = exists(root.left, p);
		boolean is_p_on_right = exists(root.right, p);
		boolean is_q_on_left = exists(root.left, q);
		boolean is_q_on_right = exists(root.right, q);

		if ((!is_p_on_left && !is_p_on_right) || (!is_q_on_left && !is_q_on_right)) {
			return null;
		} else if ((is_p_on_left && is_q_on_right) || (is_p_on_right && is_q_on_left)) {
			return root;
		} else if (is_p_on_left && is_q_on_left) {
			findFCA(root.left, p, q);
		} else if (is_p_on_right && is_q_on_right) {
			findFCA(root.right, p, q);
		}
		
		return null;
	}

	boolean exists (Node node, Node p) {
		if (node == null) return false;
		if (node ==p ) return true;
		return (exists(node.left, p) || exists(node.right, p));
	}

	// Method2 

	Node findLCA2 (Node root, Node p, Node q) {
		if (root == null) return null;

		if (root == p || root == q) return root;

		Node left = findLCA2(root.left, p, q);

		Node right = findLCA2(root.right, p, q);

		if (left != null && right != null) {
			return root;
		} else if (left != null) {
			return left;
		} else if (right != null) {
			return right;
		} else {
			return null;
		}
	}
}
