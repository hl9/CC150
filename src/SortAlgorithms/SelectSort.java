package SortAlgorithms;

import java.util.Arrays;

public class SelectSort {
	public static void selectSort(int[] arr) {
		int i, min, minindex, j;

		for (i=0; i<arr.length; i++) {
			min = arr[i];
			minindex = i;
			for (j=i; j<arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minindex = j;
				}	
			}
			if (min != i) {
				arr[minindex] = arr[i];
				arr[i] = min;
			}
		}
	}

	public static void main (String[] args) {
		int[] nums = new int[args.length];
		for (int i=0; i<args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
		selectSort(nums);
		System.out.println(Arrays.toString(nums));
	}
}