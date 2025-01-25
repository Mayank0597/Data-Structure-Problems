package basicMathsQuestions;

import java.util.*;

public class LargestElement {

  public static void findLargest(int[] numbers) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > largest) {
        largest = numbers[i];
      }
    }
    System.out.println("The largest number is: " + largest);
  }

  public static void main(String[] args) {
    int[] numbers = { 23, 56, 89, 12, 34, 78 };
    findLargest(numbers);
  }
}
