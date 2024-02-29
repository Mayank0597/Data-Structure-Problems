package arrays;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArraysOptimizedWay {

	public static void main(String[] args) {
		int A[] = {1,2,2,3,3,4,5,6};
		int B[] = {2,3,3,5,6,7};
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		int i=0, j=0;
		while(i<A.length && j<B.length) {
			if(A[i]<B[j]) {
				i++;
			}
			else if(A[i]>B[j]) {
				j++;
			}
			else {intersection.add(A[i]);
				i++;
				j++;
			}
		}
		for(int k:intersection) {
			System.out.print(k+" ");
		}
	}

}
