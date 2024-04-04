package striver;

public class TwoSumUsingTwoPointerMethod {
	
	public static String twoSum(int n, int arr[], int target) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			if(arr[l]+arr[r]==target) {
				return "YES";
			}
			if(arr[l]+arr[r]<target) {
				l++;
			}
			if(arr[l]+arr[r]>target) {
				r--;
			}
			
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);

	}

}
