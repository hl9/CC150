package Questions;
// check if a Binary Tree is balanced
//solution from book -- enhanced

public class Four1_isBSTBalanced {
	class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rightChild;

		public TreeNode (int n) {
			data = n;
			leftChild = null;
			rightChild = null;
		}
	}

	boolean isBalanced(TreeNode root) {
	   if (root == null) return true;
	   
	   if (getHeight(root) < 0) return false;
	   
	   return true;

	}

	int getHeight(TreeNode root) {
		if (root == null)  return 0;
		
		int ll = getHeight(root.leftChild);
		if (ll < 0) return -1;
		
		int rr = getHeight(root.rightChild);
		if (rr < 0) return -1;
		
		if (Math.abs(ll-rr) > 1 ) return -1;
		
		return Math.max(ll, rr) + 1;
	}

}
