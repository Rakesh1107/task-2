package arraytasks;

import java.util.ArrayList;

public class ArrayListConverter {
	
	public static ArrayList<Integer> convertToArrayList(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();

		for(int temp: numbers)
			list.add(temp);

		return list;
	}
}