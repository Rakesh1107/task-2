package stringtasks;

public class StringReverserByWord {
	
	public static void reverse_words(String message) {
		StringBuilder temp = new StringBuilder();
		String[] tokens = message.split(" ");

		for(int i = tokens.length-1; i >= 0; i--) {
			temp.append(tokens[i]).append(" ");
		}
		
		System.out.println("The message with reversed order of words: ");
		System.out.println(temp);

	}
}