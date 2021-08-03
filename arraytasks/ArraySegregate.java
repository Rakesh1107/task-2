package arraytasks;

import java.util.Arrays;

public class ArraySegregate {

	public static void segregateArray(int[] numbers) {
		int count = 0;
		for(int temp: numbers)
			if(temp == 0)
				count++;

		int index = 0;
		for(; index < count; index++)
			numbers[index] = 0;

		for(; index < numbers.length; index++)
			numbers[index] = 1;

		System.out.println("The segregated array is: " + Arrays.toString(numbers));
	}
}