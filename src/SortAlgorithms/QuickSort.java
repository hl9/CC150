package SortAlgorithms;
// PIVOT, Partition, Recursion
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	public static void main (String[] args) {
		int[] nums = new int[5];
		buildArray(nums, nums.length);
		System.out.println(Arrays.toString(nums));
//		sort(nums, nums.length);
		quickSort(nums, nums.length);
		System.out.println(Arrays.toString(nums));
	}

	public static void sort(int[] nums, int begin, int end) {
		if ((end - begin) < 1 ) return;
		Random rand = new Random();
		int p = rand.nextInt(end-begin) + begin;
		int pivot = nums[p];
		System.out.println("Calling sort nums, " + begin + ", " + end + ". PIVOT=" + pivot + ". p=" + p);
		int i=begin;
		int j=end;
		
		while (i<j) {
			while (nums[i] < pivot) i++;
			while (nums[j] > pivot) j--;
			System.out.println("DEbug i=" + i + " j=" + j);
			if (nums[i]>= pivot && nums[j]<=pivot) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
//				i++;
//				j--;
			}
			System.out.println("DEBUG: after swap" + i + "  " + j);
			System.out.println(Arrays.toString(nums));
		}
		
		sort(nums, begin, i-1);
		sort(nums, j+1, end);
	}
	
	
	public static void quickSort(int[] nums, int size) {
		if (size < 2)	 return;
		sort(nums, 0, size-1);
		
	}
	
	public static void sort(int[] arrs, int size) {
		int tmp, i, j;
		
		if (size < 2) {
			return; 
		}
		
		Random rand = new Random();
		int q = rand.nextInt(size-1);
		int pivot = arrs[q];		
		
		i=0; 
		j=size-1;
		while (i<j) {
			if (arrs[i] < pivot) {
				i++;
			}
			if (arrs[j] > pivot) {
				j--;
			}
			if (arrs[i]>=pivot && arrs[j]<=pivot) {
				// swap
				tmp=arrs[i];
				arrs[i]= arrs[j];
				arrs[j] = tmp;
				i++;
				j--;
			}
		}		
		int[] L = new int[i];
		int[] R = new int[arrs.length-i-1];
		for (j=0; j<i; j++) {
			L[j]=arrs[j];
		}
		for (j=0; j<arrs.length-i-1; j++) {
			R[j] = arrs[j+i];
		}
		sort(L, L.length);
		sort(R, R.length);
		
//		System.out.println(Arrays.toString(arrs));
	}
	
	public static void buildArray(int[] arr, int n) {
		Random rand = new Random();
		for (int i=0; i<n; i++) {
			arr[i] = rand.nextInt(20);
		}
//		arr[0]=3;
//		arr[1]=8;
//		arr[2]=5;
//		arr[3]=15;
//		arr[4]=1;
	}
	
}