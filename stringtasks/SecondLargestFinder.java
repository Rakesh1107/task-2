package stringtasks;

import java.util.Arrays;

public class SecondLargestFinder {
	
	public static void findSecondLargest(int[] numbers) {
		Arrays.sort(numbers);
		System.out.println("The second largest element in the array is: ");
		System.out.println(numbers[numbers.length-2]);

	}	
}