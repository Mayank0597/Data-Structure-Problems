package striver;

public class MaxSumArray {
	 public static int maxSubarraySum(int[] arr, int n) {
	        int maxi = Integer.MIN_VALUE; 

	        for (int i = 0; i < n; i++) {
	            int sum = 0;
	            for (int j = i; j < n; j++) {
	               
	                sum += arr[j];

	                maxi = Math.max(maxi, sum); 
	            }
	        }

	        return maxi;
	    }

	    public static void main(String args[]) {
	        int[] arr = { 1,2,3,4,5};
	        int n = arr.length;
	        int maxSum = maxSubarraySum(arr, n);
	        System.out.println("The maximum subarray sum is: " + maxSum);

	    }
}
