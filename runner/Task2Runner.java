package runner;

import arraytasks.ArrayListConverter;
import arraytasks.ArraySegregate;
import arraytasks.ArraySorter;
import stringtasks.SecondLargestFinder;
import stringtasks.StringReverserByLetter;
import stringtasks.StringReverserByWord;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task2Runner {
	
	public static void main(String[] args) throws IOException {

		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter program number to execute (1-6): ");
		int option = Integer.parseInt(inputReader.readLine());

		if(option == 4 || option == 5) {
			System.out.println("Enter a message/string: ");
			String message = inputReader.readLine();
			if(option == 4)
				StringReverserByLetter.reverseString(message);
			else 
				StringReverserByWord.reverse_words(message);
		}

		else {
			System.out.println("Enter the size of array: ");
			int size = Integer.parseInt(inputReader.readLine());
			int[] array = new int[size];
			System.out.println("Enter elements of array as space-separated integers: ");
			String input = inputReader.readLine();
			String[] inputs = input.split(" ");
			for(int index = 0; index < size; index++)
				array[index] = Integer.parseInt(inputs[index]);

			switch(option) {
				case 1:
					SecondLargestFinder.findSecondLargest(array);
					break;
				case 2:
					ArraySegregate.segregateArray(array);
					break;
				case 3:
					ArraySorter.sortArray(array);
					break;
				case 6:
					ArrayList<Integer> list = ArrayListConverter.convertToArrayList(array);
					System.out.println(list);
					break;
				default:
					System.out.println("Enter valid option!");
					break;
			}
		}
	}
}