package arrays;

public class CountSubArrayHavingSumEqualsK {

	public static void main(String[] args) {
		int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
		int k=3;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int x=i;x<=j;x++) {
					sum=sum+arr[x];
				}
				if(sum==k) {
					count++;
			}
		}
		
			
		}
		System.out.println("Number of SubArrays whose sum is "+k+" : "+count);

	}

}
