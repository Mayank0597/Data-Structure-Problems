package striver;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	public static int majorityElement(int []arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			int value=map.getOrDefault(arr[i],0 );
			map.put(arr[i], value+1);
		}
		for(Map.Entry<Integer, Integer> it:map.entrySet()) {
			if(it.getValue()>(arr.length/3)) {
				return it.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,3,3,1,2,2,2,2};
		int ans = majorityElement(arr);
		System.out.println(ans);
		

	}
	

}
