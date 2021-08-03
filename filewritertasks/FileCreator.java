package filewritertasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		try {
			FileWriter writer = new FileWriter(file);
			writer.write("Programmatically created file.\n");
			writer.write("These words were written programmatically.\n");
			writer.write("All is well. Be happy & enjoy the moment.\n");
			writer.flush();
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}