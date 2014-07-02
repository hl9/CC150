package DataStructure;

import java.util.*;

public class tryLindedListNode {
	static void test() {
//		Stack<Integer> s = new Stack<Integer>();
//		s.push(15);
//		s.push(115);
//		System.out.println(s.size());
//		System.out.println(s.peek());
//		System.out.println("------------------------------");
//		
//		Vector<Integer> v = new Vector<Integer>();
//		v.addElement(15);
//		v.addElement(115);
//		System.out.println(v.elementAt(1));
//		
//		for (Enumeration<Integer> e = v.elements(); e.hasMoreElements();) {
//			System.out.println(e);
//		}
//		System.out.println("------------------------------");
		
		int[] arr = new int[10];
		Random rand = new Random();
		for (int i=0; i<arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		int ele = arr[8];
		
		System.out.println("Print origianl array");
		System.out.println(Arrays.toString(arr));
		System.out.println("Print sorted array");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Locate element in array");
		System.out.println(Arrays.binarySearch(arr, ele));
		System.out.println(Arrays.binarySearch(arr, 50));
		
		LinkedList ll = new LinkedList();
//		ll.add(arg0)
		Iterator i = ll.iterator();
		ll.getFirst();
		
		
//		LinkedListNode n = new LinkedListNode();
		
		
		HashSet hs = new HashSet();
		hs.add(5);
		
	}
	
	public static void main(String[] args) {
		test();
	}
}
