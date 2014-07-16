package Questions;

// Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.

public class Four3_createBinaryTree {
// root = arr[0]
// for any root i
	// left child = arr[2i+1];
	// right child = arr[2i+2];
	// parent = arr[(i-1)/2];
	
	class BSTNode {
		int data;
		BSTNode LChild;
		BSTNode RChild;

		public BSTNode (int n) {
			data = n;
			LChild = null;
			RChild = null;
		}
	}

	BSTNode buildBST(int[] sortedArr, int start, int end) {

		if (start > end) return null;

		if (start == end) return new BSTNode(sortedArr[start]);
		
		int mid = (end + start) / 2;
		
		BSTNode root = new BSTNode(sortedArr[mid]);
		root.LChild = buildBST(sortedArr, start, mid-1);
		root.RChild = buildBST(sortedArr, mid+1, end);
		
		return root;
	}

	BSTNode buildBST(int[] sortedArr) {

		int start = 0;
		int end = sortedArr.length - 1;

		BSTNode root = buildBST(sortedArr, start, end);

		return root;
	}
	
}
