package arrays;

import java.util.SortedSet;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {1,1,2,3,4,5};
		int[] arr2 = {2,3,4,4,5,6};
		SortedSet<Integer> s = new TreeSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			s.add(arr2[i]);
		}
		Integer[] union = s.toArray(new Integer[s.size()]);
		System.out.println("Union of two sorted arrays are");
		for(int i:union) {
			System.out.print(i+" ");
		}
		}
	}


