package arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArrayOptimizedWay {

	public static void main(String[] args) {
		int[] arr1 = {1,1,2,3,4,5};
		int[] arr2 = {2,3,4,4,5,6};
		int i=0,j=0;
		ArrayList<Integer> union = new ArrayList<Integer>();
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				if(union.size()==0 || union.get(union.size()-1)!=arr1[i]) {
					union.add(arr1[i]);
					
				}
				i++;
			}
			else
			{
				if(union.size()==0 || union.get(union.size()-1)!=arr2[j]) {
					union.add(arr2[j]);
					
				}
				j++;
			}
		}
		while(i<arr1.length) {
			if(union.get(union.size()-1)!=arr1[i]) {
				union.add(arr1[i]);
				
			}
			i++;
		}
		while(j<arr2.length) {
			if(union.get(union.size()-1)!=arr2[j]) {
				union.add(arr2[j]);
				
			}
			j++;
		}
		System.out.println("Union of two Sorted arrays are ");
		for(int k:union) {
			System.out.print(k+" ");
		}
	}

}
