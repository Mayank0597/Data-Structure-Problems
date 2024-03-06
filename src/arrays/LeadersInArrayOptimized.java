package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArrayOptimized {

	public static void main(String[] args) {
		int[] arr= {10,22,12,3,0,6};
		List<Integer> ans = new ArrayList<Integer>();
		int max=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
			ans.add(arr[i]);
		}
		}
		//Collections.sort(ans, Collections.reverseOrder());
		Collections.reverse(ans);
		for(int i:ans) {
			System.out.print(i+" ");
		}

	}

}
