package SortAlgorithms;

import DataStructure.Implement_Heap;

public class HeapSort extends Implement_Heap {
	public HeapSort(int capacity) {
		super(capacity);
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

}
