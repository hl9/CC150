package SortAlgorithms;

import java.util.Arrays;

public class BinarySearch {
	public static int search(int T, int[] arrs, int floor, int ceiling) {
		while (floor<ceiling) {
			int k = (floor+ceiling)/2;
			if (arrs[k] == T) {
				return k;
			} else if (arrs[k] < T) {
				floor = k;
			} else if (arrs[k] > T) {
				ceiling = k;
			} else {
				return -1;
			}
		}
		return 0;
	}

	public static void main (String[] args) {
		int Target = Integer.parseInt(args[0]);
		int[] nums = new int[args.length-1];

		for (int i=0; i<args.length-1; i++) {
			nums[i] = Integer.parseInt(args[i+1]);
		}
		
		int r = search(Target, nums, 0, nums.length-1);
		System.out.println(r);
	}
}
