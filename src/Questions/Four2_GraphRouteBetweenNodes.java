package Questions;

// Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

import java.util.*;

public class Four2_GraphRouteBetweenNodes {

	class Node {
		char tag;
		Node next;
		State visited;
		
		Node getAdjacents() {
			// implement node.getAdjacents(). Return all adjacent nodes
			return null;
		}
		
	}
	
	class Graph {
		ArrayList<Node> Nodes;
		ArrayList Vertices;
		
		ArrayList<Node> getNodes() {
			return Nodes;
		}
	}
	
	enum State {
		Visited, Visiting, Unvisited;
	}

	boolean Search(Graph g, Node start, Node end) {
		if (start == end) return true;

		// traverse the graph g from start.
		LinkedList<Node> queue = new LinkedList<Node>();

		// initialize State for all Nodes
		for (Node n : g.getNodes()) {
			n.visited = State.Unvisited;
		}

		start.visited = State.Visiting;
		queue.add(start);

		while (!queue.isEmpty()) {
			Node n = queue.removeFirst(); //queue.getFirst();
			if ( n != null) {
				for (Node v : n.getAdjacents()) {
					if (v == end) return true;
					if (v.visited == State.Unvisited) {
						queue.add(v);
						v.visited = State.Visiting;
					}
				}
			}
			n.visited = State.Visited;
		}
		return false;

	}
}
