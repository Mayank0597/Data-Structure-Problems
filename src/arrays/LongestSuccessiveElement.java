package arrays;

public class LongestSuccessiveElement {

	public static boolean linearSearch(int[] a, int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 100, 200, 1, 2, 3, 4 };
		int longest = 1;
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int cnt = 1;
			while (linearSearch(arr, x + 1) == true) {
				x += 1;
				cnt += 1;
			}

			longest = Math.max(longest, cnt);

		}
		System.out.println("The longest consecutive sequence is " + longest);

	}
}
