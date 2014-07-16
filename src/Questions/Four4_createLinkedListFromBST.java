package Questions;

import java.util.LinkedList;
import java.util.ArrayList;

public class Four4_createLinkedListFromBST {
	
	class Node {
		int data;
		Node left;
		Node right;

		public Node (int n) {
			data = n;
			left = null;
			right = null;
		}
	}
	
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
	
	
	ArrayList<LinkedList<BSTNode>> findLevelLinkedList(BSTNode root) {
		ArrayList<LinkedList<BSTNode>> result = new ArrayList<LinkedList<BSTNode>>();
		int level = 0;
		LinkedList<BSTNode> list = new LinkedList<BSTNode>();
		
		list.add(root);
		result.add(level, list);
		
		
		while (true) {
			list = new LinkedList<BSTNode>();
			for (int i=0; i< result.get(level).size(); i++) {
				BSTNode n = result.get(level).get(i);
				if (n != null) {
					if (n.getLeft() != null) list.add(n.getLeft());
					if (n.getRight() != null) list.add(n.getRight());
				}
			}
			
			if (list.size() > 0) {
				result.add(level+1, list);
			} else {
				break;
			}
			
			level++;
		}
		
		return result;
	}

	
	ArrayList<LinkedList<Node>> getDLinkedLists(Node root) {

		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		int level = 0;
		LinkedList<Node> list = new LinkedList<Node>();
		list.add(root);
		result.add(level, list);

		while (true) {
			list = new LinkedList<Node>();
			LinkedList<Node> parentList = result.get(level); //result[level];
			for (Node n : parentList) {
				if (n.left != null) list.add(n.left);
				if (n.right != null) list.add(n.right);
			}

			if (list.size() > 0 ) { //(list != null) {
				result.add(level+1, list); // result.add(level, list);
			} else {
				break;
			}

			level ++;
		}



		return result;
	}
}
