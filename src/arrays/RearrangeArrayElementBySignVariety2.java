package arrays;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementBySignVariety2 {

	public static void main(String[] args) {
		int arr[] = {1,2,-4,-5,3,6};
		List<Integer> pos = new ArrayList<Integer>();
		List<Integer> neg = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				pos.add(arr[i]);
			}
			else
				neg.add(arr[i]);
		}
//		for(int i=0;i<2;i++) {
//			arr[2*i]=pos.get(i);
//		}
//		for(int i=0;i<neg.size();i++) {
//			arr[(2*i)+1]=neg.get(i);
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		if(pos.size()>neg.size()) {
			for(int i=0;i<neg.size();i++) {
				arr[2*i]=pos.get(i);
				arr[(2*i)+1]=neg.get(i);
			}
			int index = neg.size()*2;
			for(int i=neg.size();i<pos.size();i++) {
				arr[index]=pos.get(i);
				index++;
			}
		}
		else {
			for(int i=0;i<pos.size();i++) {
				arr[2*i]=pos.get(i);
				arr[(2*i)+1]=neg.get(i);
			}
			int index = pos.size()*2;
			for(int i=pos.size();i<neg.size();i++) {
				arr[index]=neg.get(i);
				index++;
			}
	}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
