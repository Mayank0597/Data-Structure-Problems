package arrays;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,3,3,4,5,6};
		int[] arr2 = {2,3,3,5,6,6};
		int[] visited = new int[arr2.length];
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j] && visited[j]==0) {
					intersection.add(arr2[j]);
					visited[j]=1;
					break;
				}
				if(arr2[j]>arr1[i]) break;
			}
		}
		System.out.println("Intersection of two array ");
		for(int i: intersection) {
			System.out.print(i+" ");
		}
	}

}
