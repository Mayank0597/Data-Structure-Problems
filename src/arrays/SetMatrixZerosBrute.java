package arrays;

public class SetMatrixZerosBrute {
	public static void markRow(int i, int[][] arr) {
		for (int j = 0; j < 4; j++) {
			if (arr[i][j] != 0) {
				arr[i][j] = -1;
			}
		}
	}

	public static void markColumn(int j, int[][] arr) {
		for (int i = 0; i < 4; i++) {
			if (arr[i][j] != 0) {
				arr[i][j] = -1;
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 },
				{ 1, 1, 0, 1 }, 
				{ 1, 1, 1, 1 } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr[i][j] == 0) {
					markRow(i, arr);
					markColumn(j, arr);
				}
			}

		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr[i][j] == -1) {
					arr[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}

}
