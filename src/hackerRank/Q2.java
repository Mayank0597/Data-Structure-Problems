package hackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   // Read input
   int n = scanner.nextInt(); // Total number of integers
   int k = scanner.nextInt(); // Size of the subarray
   int[] nums = new int[n];
   for (int i = 0; i < n; i++) {
       nums[i] = scanner.nextInt();
   }

   // Initialize deque and set to store unique elements
   Deque<Integer> deque = new ArrayDeque<>();
   Set<Integer> uniqueSet = new HashSet<>();
   int maxUnique = 0;

   // Process each subarray using sliding window approach
   for (int i = 0; i < n; i++) {
       // Add current element to deque and set
       deque.add(nums[i]);
       uniqueSet.add(nums[i]);

       // Remove element from front of deque if window size exceeds k
       if (deque.size() > k) {
           int removed = deque.removeFirst();
           if (!deque.contains(removed)) {
               uniqueSet.remove(removed);
           }
       }

       // Update maxUnique if needed
       maxUnique = Math.max(maxUnique, uniqueSet.size());

       // Optimize: if maxUnique reaches k, it can't be exceeded
       if (maxUnique == k) {
           break;
       }
   }

   // Print the maximum number of unique integers
   System.out.println(maxUnique);

   scanner.close();
}
}
