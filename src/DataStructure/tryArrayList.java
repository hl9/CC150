package DataStructure;
// try ArralyList and Iterator
// Use Iterator to display, and update elements in the ArrayList
import java.util.*;

public class tryArrayList {
	
	public static ArrayList<String> merge(String[] words, String[] more) {
		ArrayList<String> al = new ArrayList<String>();
		
		for (String str : words) {
			al.add(str);
		}
		
		for (String str : more) {
			al.add(str);
		}

	
		return al;
	}
	
	public static void printArrayList(ArrayList<String> al) {
		for (String s : al) {
			System.out.print(s+ " ");
		}
	}
	
	public static void iterateArraList(ArrayList<String> al) {
		Iterator<String> it = al.iterator();
		
		// Use iterator to display contents of al
		while (it.hasNext()) {
//			System.out.println("iterator " + it.toString());
//			it.next();
			Object element = it.next();
			System.out.print(element.toString() + " ");
		}
		System.out.println();
		
		// Modiy objects being iterated
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "+");
		}
		
		System.out.println("Modified cntents of al: ");
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Display the list backwards
		System.out.print("Modified list backwards: ");
		while(litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		
	}
	
	public static void main(String[] args) {
		String[] words = new String[3];
		String[] more = new String[2];
		
		words[0] = "I";
		words[1] = "am";
		words[2] = "cool";
		
		more[0] = "Yes";
		more[1] = "true";
		
		ArrayList<String> al = new ArrayList<String>();
		al = merge(words, more);
//		printArrayList(al);
		
		iterateArraList(al);
	}
}
