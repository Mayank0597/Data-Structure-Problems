package arrays;

import java.util.HashSet;

public class LongestSuccessiveElementOptimized {

	public static void main(String[] args) {
		int[] arr = {102,4,100,1,101,3,2,1,1};
		HashSet<Integer> set = new HashSet<Integer>();
		int longest=1;
		for(int i: arr) {
			set.add(i);
		}
		System.out.println("Elements in Set are :");
		
		for(int i:set) {
			System.out.print(i+" ");
		}
		for(int i:set) {
			
			if(!set.contains(i-1)) {
				int count=1;
				int x=i;
				 while (set.contains(x + 1)) {
	                    x = x + 1;
	                    count = count + 1;
	                }
	                longest = Math.max(longest, count);
			}
			
			}
		System.out.println();
		System.out.println("Longest Consecutive elements are :"+longest);
		}

	}


