package SortAlgorithms;

public class BubbleSort {
	public static void main(String[] args) {
		int i, j, tmp;
		for (j=args.length-1; j>0; j--) {
			for (i=0; i<j; i++) {
				if (Integer.parseInt(args[i])>Integer.parseInt(args[i+1])) {
					tmp=Integer.parseInt(args[i]);
					args[i]=args[i+1];
					args[i+1]=Integer.toString(tmp);
				}
			}
		}
		for (i=0; i<args.length; i++) {
			System.out.print(args[i] + " ");
		}
	}
}

