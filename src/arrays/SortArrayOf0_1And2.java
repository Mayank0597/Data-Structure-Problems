package arrays;

public class SortArrayOf0_1And2 {

	public static void main(String[] args) {
		int[] arr= {0,1,2,0,1,2,1,2,0,0,0,1};
		int cnt0=0,cnt1=0,cnt2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				cnt0++;
			else if(arr[i]==1)
				cnt1++;
			else 
				cnt2++;
		}
		for(int i=0;i<cnt0;i++) {
			arr[i]=0;
		}
		for(int i=cnt0;i<cnt1+cnt0;i++) {
			arr[i]=1;
		}
		for(int i=cnt1+cnt0;i<cnt2+cnt1+cnt0;i++) {
			arr[i]=2;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
