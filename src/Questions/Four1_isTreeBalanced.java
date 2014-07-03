package Questions;

// implement a function to check if a tree is balanced.
// a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from the root by more than one.

public class Four1_isTreeBalanced {

	class BinaryTreeNode {
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;
		
		public BinaryTreeNode(int n) {
			data = n;
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public BinaryTreeNode getLeft() {
			return left;
		}

		public void setLeft(BinaryTreeNode left) {
			this.left = left;
		}

		public BinaryTreeNode getRight() {
			return right;
		}

		public void setRight(BinaryTreeNode right) {
			this.right = right;
		}
		
		
	}
	
	int calculateHeight(BinaryTreeNode node) {
		if (node == null) {
			return 0;
		} else {
			int hl = calculateHeight(node.getLeft()) + 1;
			int hr = calculateHeight(node.getRight()) + 1;
			return (hl>hr)?hl:hr;
		}
	}
	
	boolean isTreeBalanced(BinaryTreeNode root) {
		if (root == null) return true;
		
		boolean flagl;
		boolean flagr;
		
		int hl = calculateHeight(root.getLeft());
		int hr = calculateHeight(root.getRight());
		
		if ((hl-hr>1) || (hl-hr<-1)) return false;

		flagl = isTreeBalanced(root.getLeft());
		flagr = isTreeBalanced(root.getRight());
		
		return (flagl && flagr);
	}
	
	int maxDepth(BinaryTreeNode root) {
		if (root == null) return 0;
		return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
	}
	
	int minDepth(BinaryTreeNode root) {
		if (root == null) return 0;
		return Math.min(minDepth(root.getLeft()), minDepth(root.getRight())) + 1;
	}
	
	boolean isRealBalanced(BinaryTreeNode root) {
		return (maxDepth(root) - minDepth(root) <= 1);
	}
}