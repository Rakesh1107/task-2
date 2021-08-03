package stringtasks;

public class StringReverserByLetter {
	
	public static void reverseString(String word) {
		StringBuilder reversedWord = new StringBuilder();
		
		for(int i = word.length()-1; i >= 0; i--) 
			reversedWord.append(word.charAt(i));

		System.out.println("The reversed string is: ");
		System.out.println(reversedWord);
	}
}