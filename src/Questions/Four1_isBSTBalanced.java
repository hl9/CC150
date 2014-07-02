package Questions;
// check if a Binary Tree is balanced

public class Four1_isBSTBalanced {
	
	class BinaryTreeNode {
		int data;
		BinaryTreeNode left;
		BinaryTreeNode right;
		
		public BinaryTreeNode(int n) {
			data = n;
			left = null;
			right = null;
		}
	}
	
	boolean isBTBalanced(BinaryTreeNode root) {
		if (root == null) return true;
		
		int lLeft = getLength(root.left);
		int lRight = getLength(root.right);
		
		if ((lLeft - lRight > 1) || (lRight - lLeft > 1)) return false;
		
		return (isBTBalanced(root.left) && isBTBalanced(root.right));
	}
	
	int getLength(BinaryTreeNode node) {
		if (node == null) return 0;
		
		int l = 0;
		
		
		
		return l;
	}
}
