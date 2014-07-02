package DataStructure;

import java.util.*;

public class Implement_BinaryTreeTraverse {
	static class BinaryTreeNode  {
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
	
	static void DLRTraverse(BinaryTreeNode root) {
		if (root !=null ) {
			System.out.println(root.getData());
			DLRTraverse(root.getLeft());
			DLRTraverse(root.getRight());
		}
	}
	
	static void DLRTraverse2(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		BinaryTreeNode node = root;
		
		while(true) {
			while (node != null) {
				System.out.println(node.getData());
				stack.push(node);
				node = node.getLeft();
			}
			if (!stack.isEmpty()){
				node = stack.pop();
				node = node.getRight();
			} else break;
		}
	}
	
	static void LDR(BinaryTreeNode root) {
		if (root != null) {
			LDR(root.getLeft());
			System.out.println(root.data);
			LDR(root.getRight());
		}
	}
	
	static void LDR2(BinaryTreeNode root) {
		BinaryTreeNode node = root;
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		while (true) {
			while (node != null) {
				stack.push(node);
				node = node.getLeft();
			}
			if (stack.isEmpty()) break;
			node = stack.pop();
			System.out.println(node.getData());
			node = node.getRight();
		}
	}
	
	static void LRD(BinaryTreeNode root) {
		if (root != null) {
			LRD(root.getLeft());
			LRD(root.getRight());
			System.out.println(root.getData());
		}
	}
	
	static void LRD2(BinaryTreeNode root) {

		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		if (root == null) return;
		
		BinaryTreeNode node = root;
		BinaryTreeNode prev = null;
		
	
		while((node != null) || !stack.isEmpty()) {
			stack.push(node);

			if ((node.getLeft() != null) && (prev != node.getLeft()) && (prev != node.getRight())) {
				prev = node;
				node = node.getLeft();
			} else if ((node.getRight() != null) && (prev != node.getRight())) {
				prev = node;
				node = node.getRight();
			} else {
				// leaf node or nodes with both children visited
				System.out.println(node.getData());
				if (!stack.isEmpty() && stack.size()>1) {
					prev = stack.pop();
					node = stack.pop();
				} else break;
			}
		}
		

	 }
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode Level11 = new BinaryTreeNode(2);
		BinaryTreeNode Level12 = new BinaryTreeNode(3);
		BinaryTreeNode Level21 = new BinaryTreeNode(4);
		BinaryTreeNode Level22 = new BinaryTreeNode(5);
		BinaryTreeNode Level23 = new BinaryTreeNode(6);
		BinaryTreeNode Level24 = new BinaryTreeNode(7);
		
		root.setLeft(Level11);
		root.setRight(Level12);
		Level11.setLeft(Level21);
		Level11.setRight(Level22);
		Level12.setLeft(Level23);
		Level12.setRight(Level24);	
		
//		DLRTraverse(root);
//		DLRTraverse2(root);
//		LDR(root);
//		LDR2(root);
//		LRD(root);
		LRD2(root);
	}
}
