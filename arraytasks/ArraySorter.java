package arraytasks;

import java.util.Arrays;

public class ArraySorter {
	
	public static void sortArray(int[] numbers) {
		Arrays.sort(numbers);
		int size = numbers.length;
		int[] tempArray = new int[size];
		int end = size-1, start = 0;

		for(int index = 0; index < size; index++) {
			if(index % 2 == 0)
				tempArray[index] = numbers[end--];
			else
				tempArray[index] = numbers[start++];
		}

		System.out.println("The sorted array is : " + Arrays.toString(tempArray));
	}
}