package arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr= {2,2,3,3,1,2,2,3};
		for(int i=0;i<arr.length;i++) {
			int cnt=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
				}
				if(cnt>(arr.length/2)) {
					System.out.println("Majority Element is "+arr[i]);
				}
			}
			
		}

	}

}
