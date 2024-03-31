package striver;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int N = 7; // Example: Print Pascal's triangle up to the 5th row
        int[][] triangle = pascalTriangle(N);
        
        // Display the Pascal's triangle
        displayTriangle(triangle);
    }

    public static int[][] pascalTriangle(int N) {
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = -1;
                }
            }
        }
        for (int i = 2; i < N; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        return arr;
    }

    public static void displayTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

