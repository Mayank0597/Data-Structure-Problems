package arrays;

public class LinearSearch {

	static int LinearSearch(int[] arr, int n, int element) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 5, element = 7;
		int[] arr = { 1, 3, 5, 7, 8 };
		System.out.println(LinearSearch(arr, n, element));
	}
}
