package hackerRank;

import java.util.Scanner;

public class Q3 {
	 static long arrayManipulation(int n, int[][] queries) {
	        long[] arr = new long[n + 2]; 
	        for (int i = 0; i < queries.length; i++) {
	            int a = queries[i][0];
	            int b = queries[i][1];
	            int k = queries[i][2];
	            arr[a] += k; 
	            arr[b + 1] -= k; 
	        }
	        
	        long max = 0, sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += arr[i];
	            max = Math.max(max, sum);
	        }
	        return max;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int q = scanner.nextInt();
	        int[][] queries = new int[q][3];
	        for (int i = 0; i < q; i++) {
	            queries[i][0] = scanner.nextInt();
	            queries[i][1] = scanner.nextInt();
	            queries[i][2] = scanner.nextInt();
	        }
	        long result = arrayManipulation(n, queries);
	        System.out.println(result);
	        scanner.close();
	    }
}
