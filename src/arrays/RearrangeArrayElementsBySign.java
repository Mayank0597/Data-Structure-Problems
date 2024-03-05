package arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySign {

	public static void main(String[] args) {
		int[] arr = {3,1,-2,-5,2,-4};
		List<Integer> pos = new ArrayList<Integer>();
		List<Integer> neg = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0)
				pos.add(arr[i]);
			else
				neg.add(arr[i]);
		}
		for(int i=0;i<arr.length/2;i++) {
			arr[2*i]=pos.get(i);
			arr[(2*i)+1]=neg.get(i);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
