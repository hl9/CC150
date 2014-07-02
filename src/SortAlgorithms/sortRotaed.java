package SortAlgorithms;

public class sortRotaed {
	public static int findMin(int[] arr)  {
		int i, j, k;
		i = 0;
		j = arr.length-1;
		k = (i+j)/2;	
		
		if (arr[i]<arr[j]) {
			return arr[i];
		}
		
		while (i<j) {
			k = (i+j)/2;
			if (i==k || j==k) {
				return((arr[i]>arr[j])?arr[j]:arr[i]);
			}
			if (arr[i]<arr[k]) {
				i=k;
			} else if (arr[i]>arr[k]) {
				j=k;		
			}
		}
		return((arr[i]>arr[j])?arr[i]:arr[j]);
	}
	
	public static void main(String[] args) {
		int[] nums = new int[args.length];
		for (int i=0; i<args.length; i++) {
			nums[i] = Integer.parseInt(args[i]);
		}
//		findMin(nums);
		System.out.println(findMin(nums));
	}
	
}