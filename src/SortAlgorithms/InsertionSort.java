package SortAlgorithms;


public class InsertionSort {
	public static void main(String[] args) {
		int i, j;
		String tmp;		

		for (i=1; i<args.length; i++ ) {
			j=i;
			while (j>0 && Integer.parseInt(args[j])<Integer.parseInt(args[j-1])) {
				tmp=args[j];
				args[j] = args[j-1];
				args[j-1] = tmp;
				j--;
			}
		}

		for (i=0; i<args.length; i++ ) {
			System.out.print(args[i] + " " );
		}
	}
}