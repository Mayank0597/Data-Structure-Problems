package arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
	
	public static int longestIncreasingSubsequence(List<Integer> arr) {
	    for(int i=1;i<arr.size();i++) {
	    	if(arr.get(i)<arr.get(i-1)) {
	    		arr.remove(i);
	    	}
	    }
		return arr.size();


	    }


	public static void main(String[] args) {
		List<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(15);
		arrlist.add(27);
		arrlist.add(14);
		arrlist.add(38);
		arrlist.add(26);
		arrlist.add(55);
		arrlist.add(46);
		arrlist.add(65);
		arrlist.add(85);
		int result=longestIncreasingSubsequence(arrlist);
		System.out.println("Longest Increasing Subsequence is "+result);
		

	}

}
