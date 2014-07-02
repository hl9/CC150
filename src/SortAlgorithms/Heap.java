package SortAlgorithms;

import java.util.Random;

//only considers max heap for now
public class Heap {
	protected int[] heap;
	public int size;
	
	public Heap(int capacity) {
		this.heap = new int[capacity];
		this.size = capacity;
	}
	
	protected int getParent(int x) {
		int i = (x-1)/2;
		return (i>=0?i:-1);
	}
	
	protected int getLChild(int x) {
		int i = 2*x+1;
		return (i<this.size?i:-1);
	}
	
	protected int getRChild(int x) {
		int i = 2*x+2;
		return (i<this.size?i:-1);
	}
	
	public void generateRandomHeap(int capacity) {
		Random rand = new Random();
		this.size=0;
		for (int i=0; i<capacity; i++) {
			this.addElement(rand.nextInt(100));
		}
		
		printHeap();
	}
	
	public void printHeap() {
		int j = 0;
		int i = 0;
		int k;
		
		while (i<this.size) {
			for (k=0; k<(int)Math.pow(2,j); k++) {
				if (i<this.size) {
					System.out.print(heap[i++] + "  ");
				}
			}
			System.out.println();
			j++;
		}
	}
	
	protected void swap( int a, int b) {
		int tmp = heap[a];
		heap[a] = heap[b];
		heap[b] = tmp;
	}
	
	public int popRoot() {
//		last element goes to the top.
//		Then compare to children and swap down to bigger children, if smaller.
		int root = heap[0];
		int lc, rc;
		int i=0, j;
		
		// move last elementary to the root
		heap[0] = heap[this.size-1];
		this.size--;

		while (i<this.size) {
		// compare root to its children and swap with bigger child if needed.
			lc = this.getLChild(i);
			rc = this.getRChild(i);
			
			// if both children exist. Make sure parent is bigger than both, otherwise swap.
			if (lc > 0 && rc > 0) {
				if (heap[lc] > heap[i] || heap[rc] > heap[i]) {
					j=(heap[lc]>heap[rc]?lc:rc);
					swap(i, j);
					i = j;
				} else {
					return root;
				}
			} else if (lc>0 && rc <0 && heap[lc]>heap[i]	) {
				swap(i, lc);
				i = lc;
			} else {
				return root;
			}
		}
		
		return root;
	}
	
	public void addElement(int element) {
//		add a new element to the heap
//		add to the bottom first. Then compare to parent and swap up if bigger.
		int i = this.size;
		int p;
		
		heap[this.size++] = element;
		
		while (i>0) {
			p = this.getParent(i); 
			if (heap[p] < heap[i]) {
				swap (p, i);
				i = p;
			} else {
				return;
			}
		}
		return;
	}
	

}
