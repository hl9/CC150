package Questions;

//A sorted array has been rotated so that the elements may like 3 4 5 6 7 1 2. Find the mim

public class FindMinInRotatedSortedArray {
	public static int findMin(int[] arr) {
		int low=0;
		int high=arr.length-1;
		int k=(low+high)/2;
		int i = 0;
		if (low<high && low!=k && high!=k) {
			if (i < 10) {
			k = (low + high) / 2;
			System.out.println("Debug: i=" + i + " low="+low+" high=" + high + " k=" + k);
			if(arr[low]>arr[k]) {
				high = k;
			} else {
				low = k;
			}
			i++;
			}
		}
		
		return arr[k];
	}
	
	public static void main(String[] args) {
		int[] arr =  {3, 4, 5, 6, 7, 1, 2};
		System.out.println(findMin(arr));
	}

}
