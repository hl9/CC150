package SortAlgorithms;

public class sortList {
	public static void main(String[] args) {
		sortList(args);

	}
	public static void sortList(String[] ages){
		int[] sort;
		int i=0;
		int j=0;
		int age;
	
		sort = new int[130];
		
		//initialization
		for (i=0; i<sort.length; i++) {
			sort[i]=0;
		}
		
		//scan ages array
		for (i=0; i<ages.length; i++) {
			age=Integer.parseInt(ages[i]);
			sort[age]++;
		}
		
		//print
		for (i=0; i<sort.length; i++)	{
			for (j=0; j<sort[i]; j++) {
				System.out.print(i+" ");
			}
		}
	}

}