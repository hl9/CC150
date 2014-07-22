package Questions;

public class Four5_isBST {

	// Implement a function to check if a binary tree is a binary search tree

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

	boolean isBST(Node root) {
	// this only check children but not grandchildren and the whole left sub tree or right sub tree.
		// if(root == null) return true;

		// if (root.left != null && root.left.data > root.data) return false;

		// if (root.right != null && root.right.data < root.data) return false;

		// return (isBST(root.left) && isBST(root.right));

	}

	// Method 1 using non recursive In Order Traversal
	boolean isBSTInOrderTraverse(Node root) {
	// traverse Binary Tree use in order traverse. Put values in an array. Then check if the array is sorte.
	// takes more memory
		if (root == null) return true;

		int[] array = new int[root.size];
		int index = 0;

		Stack<Node> stack = new Stack<Node>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node node = stack.peek();
			if (node.left != null) {
				stack.push(node.left);
			} else {
				node  = stack.pop();
				array[index++] = node;
				if (node.right != null) {
					stack.push(node.right);
				}
			}
		}

		// check if array is sorted
		for (int i=1; i<array.length(); i++ ) {
			if (arr[i] <= arr[i-1]) {
				return false;
			}
		}
		return true;
	}
	// method 1 using recursive tree In Order traversal
	int index = 0;

	boolean isBSTInOrderRecursive(Node root) {
		int[] array = new int[root.size];
		
		traverse(root, array);

		// check if array is sorted
		for (int i=1; i<array.length(); i++ ) {
			if (arr[i] <= arr[i-1]) {
				return false;
			}
		}
		return true;	
	}

	void traverse(Node root, int[] array) {

		if (root == null) return;

		traverse(root.left, array);
		array[index++] = root.data;
		traverse(root.right, array);
	}

	// Method 2 checking min and max values
	boolean isBSTMinMax(Node root) {
		return isBSTMinMax(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean isBSTMinMax(Node node, Integer min, Integer max) {
		if (node == null) return false;

		if ((min != null & min > node.data) || (max != null & max <= node.data)) {
			return false;
		}

		return isBSTMinMax(node.left, min, node.data) && isBSTMinMax(node.right, node.data, max);
	}
}
