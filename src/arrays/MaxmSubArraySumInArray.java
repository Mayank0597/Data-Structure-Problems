package arrays;

public class MaxmSubArraySumInArray {

	public static void main(String[] args) {
		int[] arr= {-2,-3,4,-1,-2,1,5,-3};
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				maxi=Math.max(maxi, sum);
			}
		}
		System.out.println("Sum of Max subArray is "+maxi);

	}

}
