package SortAlgorithms;

public class MergeSort {
	private static int[] numbers;
	
	public static void merge(int[] A, int p, int q, int r) {
		int i=0, j=0, k=p, n=0, m=0;
		int[] L;
		int[] R;
		int len1, len2;
		
		len1 = q-p+1;
		len2 = r-q;
		
		L = new int[len1];
		R = new int[len2];
		
		//create Left array and Right array
		for (i=p; i<p+len1; i++) {
			L[i-p] = A[i];
		}
		
		for (i=q+1; i<q+len2+1; i++) {
			R[i-q-1] = A[i];
		}
		// sort A
		i=0;
		j=0;
		while(i<len1 && j<len2) {
//		for (k=p; k<r+1; k++) {
			if (L[i] >= R[j]) {
				A[k++] = R[j++];
			} else {
				A[k++] = L[i++];
			}
		}
		
		if (j<len2) {
			n = j;
			for (m=k; m<r+1; m++) {
				A[m] = R[n++];
			}
		} else if (i<len1)	{
			n=i;
			for (m=k; m<(q-p+1-i+k); m++) {
				A[m] = L[n++];
			}
		}
		return;
	}
	
	public static void mergeSort(int[] A, int p, int r) {
		int q;
		if (p<r)	{
			q = (p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
		return;
	}
	
	public static void main(String[] args) {
		int i;
		numbers = new int[args.length];
		for (i=0; i<args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}
		mergeSort(numbers, 0, numbers.length-1);
		for (i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
