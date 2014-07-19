package Questions;


public class isBinarySearchTree {
	class BSTNode {
		int data;
		BSTNode left;
		BSTNode right;
		
		public BSTNode(int n) {
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

		public BSTNode getLeft() {
			return left;
		}

		public void setLeft(BSTNode left) {
			this.left = left;
		}

		public BSTNode getRight() {
			return right;
		}

		public void setRight(BSTNode right) {
			this.right = right;
		}
	
	}
	
	int BSTMin(BSTNode node) {
		if (node == null) return Integer.MIN_VALUE;
		if (node.getLeft() == null) {
			return node.getData(); 
		}
		else return BSTMin(node.getLeft());
	}
	
	int BSTMax(BSTNode node) {
		if (node == null) return Integer.MAX_VALUE;
		if (node.getRight() == null) {
			return node.getData();
		} else {
			return BSTMax(node.getRight());
		}
	}
	
	boolean isBST(BSTNode root) {
		
		if(root == null) return true; 

		if (root.getLeft() != null && BSTMax(root.getLeft()) > root.getData()) {
			return false;
		}
		
		if (root.getRight() != null && BSTMin(root.getRight()) < root.getData()) {
			return false;
		}

		if (!isBST(root.getLeft()) || !isBST(root.getRight())) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
	}
}
