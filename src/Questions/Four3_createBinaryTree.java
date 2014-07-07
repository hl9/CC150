package Questions;

// Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.

public class Four3_createBinaryTree {
// root = arr[0]
// for any root i
	// left child = arr[2i+1];
	// right child = arr[2i+2];
	// parent = arr[(i-1)/2];
	
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
	
	void buildBinaryTreeMinHeight(int[] arr) {
		
		if (arr == null) return;
		
		BinaryTreeNode root = new BinaryTreeNode(arr[0]);
		
		int i = 0;
		
		// left child = arr[2i+1];
		// right child = arr[2i+2];
		// parent = arr[(i-1)/2];
		
		while (i < arr.length) {
			if (2*i + 1 < arr.length) {
				BinaryTreeNode node = new BinaryTreeNode(arr[2*i+1]);
				root.setLeft(node);
			}
			
			if (2*i + 2 < arr.length)	{
				BinaryTreeNode node = new BinaryTreeNode(arr[2*i+2]);
				root.setRight(node);
			}
	
			i++;
		}
		
	}
	
	////////////////////////////////////////////////////////////
	
	BinaryTreeNode addToTree(int[] arr, int begin, int end) {
		int mid = (begin + end) / 2;
		BinaryTreeNode node = new BinaryTreeNode(arr[mid]);
		node.setLeft(addToTree(arr, begin, mid-1));
		node.setRight(addToTree(arr, mid+1, end));
		return node;
	}
	
	void buildBinarySearchTree(int[] arr) {
		addToTree(arr, 0, arr.length-1);
	}
	
}
