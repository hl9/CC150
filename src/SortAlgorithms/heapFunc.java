package SortAlgorithms;

public class heapFunc {

	public static void main(String[] args) {
//		Heap h = new Heap(16);
//		h.generateRandomHeap(h.size);
//		
//		System.out.println("--------------------------------------------------------");
//		System.out.println("pop root: " + h.popRoot());
//		h.printHeap();
//		
//		System.out.println("--------------------------------------------------------");
//		System.out.println("--------------------------------------------------------");
//		
		HeapSort hs = new HeapSort(12);
		hs.generateRandomHeap(hs.size);
		System.out.println("--------------------------------------------------------");
		int origSize=hs.size;
		for (int i=0; i<origSize; i++) {
//			System.out.println("*** " + hs.popRoot() + " ");
			System.out.print(hs.popRoot() + " ");
//			hs.printHeap();
//			System.out.println("--------------------------------------------------------");
		}
	}
	
}
