package Questions;

import java.util.Random;

public class One7_nullifyMextrixWhen0 {
	  public static void main(String[] args) {
//	     HashMap<String, String> map = new HashMap<String, String>();
//	     map.put("hello", "world");
//	     System.out.println("hello " + map.get("hello"));
	    Random rand = new Random();
	    int[][] matrix = new int[5][7];
	    for (int i=0; i<5; i++) {
	      for (int j=0; j<7; j++) {
	        matrix[i][j] = rand.nextInt(20);
	      }
	    }
	    
	    matrix[2][1] = 0;
	    
	    printMatrix(matrix, 5, 7);
	    System.out.println("--------------------------------");
	    matrix=updateMatrix(matrix, 5, 7);
	    printMatrix(matrix, 5, 7);
	    System.out.println("--------------------------------");
	    
	  }

	  static int[][] updateMatrix(int[][] matrix, int m, int n) {
	    int i, j;
	     m=matrix.length;
	    n=matrix[0].length;
	    System.out.println("m is (5): " + String.valueOf(m));
	    System.out.println("n is (7): " + String.valueOf(n));
	    
	    for (i=0; i<m; i++) {
	      for (j=0; j<n; j++) {
	        if (matrix[i][j] == 0) {
	          matrix[i][0] = 0;
	          matrix[0][j] = 0;
	        }
	      }
	    }
	    
	    for (i=0; i<m; i++) {
	      if (matrix[i][0] == 0) {
	        nullifyRow(matrix, i, n);
	      }
	    }
	    
	    for (j=0; j<n; j++) {
	      if (matrix[0][j] == 0) {
	        nullifyColumn(matrix, j, m);
	      }
	    }
	    
	    return matrix;
	  }
	  
	   static void nullifyRow(int[][] matrix, int i, int n) {
	      for (int j=0; j<n; j++) {
	        matrix[i][j] = 0;
	      }
	   }
	  
	   static void nullifyColumn(int[][] matrix, int i, int m) {
	      for (int j=0; j<m; j++) {
	        matrix[j][i] = 0;
	      }
	   }
	  
	   static void printMatrix(int[][] matrix, int m, int n) {
	     for (int i=0; i<m; i++) {
	       for (int j=0; j<n; j++) {
	         System.out.print(matrix[i][j] + "   ");
	       }
	       System.out.println("");
	     }
	   }

}
