package DataStructure;

import java.util.LinkedList;
import java.util.Stack;

public class Implement_Graph_Traversal {
	
	class Vertex {
		char label;
		boolean visited;

		public Vertex(char lab) {
			label = lab;
			visited = false;
		}
		
		Vertex getNextUnvisitedAdjacents() {
			//TODO blabla return next unvisited adjacent
			return null;
		}

		boolean hasUnvisitedAdjacents() {
			//TODO blabla return if a vertex still has unvisited adjacents
			return false;
		}
	}

	void visit(Vertex n) {
		n.visited = true;
		System.out.println("Vertex visited " +  n.label);
	}

	void DFS(Vertex n) {
		Stack<Vertex> stack = new Stack<Vertex>();
	    visit(n);
	   // n.visited = true;
	    stack.push(n);

		while (!stack.isEmpty()) {
			Vertex r = stack.peek();
			if (r.hasUnvisitedAdjacents()) {
				Vertex s = r.getNextUnvisitedAdjacents();
				visit(s);
				s.visited = true;
				stack.push(s);
			} else {
				r = stack.pop();
			}
		}

	}

	void BFS(Vertex n) {
		LinkedList<Vertex> queue = new LinkedList<Vertex>();
		visit(n);
		queue.add(n);

		while(!queue.isEmpty()) {
			Vertex r = queue.getFirst();
			while (r.hasUnvisitedAdjacents()) {
				Vertex v = r.getNextUnvisitedAdjacents();
				visit(v);
				queue.add(v);
			}
		}
	}
}
