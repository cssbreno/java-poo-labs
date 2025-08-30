package application;

// TestingFileWriter.java

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestingFileWriter {

	public static void main(String[] args) {

		String[] lines = new String[] {
			"Hello, World!",
			"This is a test file.",
			"Java file writing example.",
			"End of the file."
		};
		String path = "C:\\Users\\User\\Documents\\output.txt";
		
		try (BufferedWriter writer = new java.io.BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				writer.write(line);
				writer.newLine();
			}
			System.out.println("File written successfully to " + path);
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}

}
// This code demonstrates how to write multiple lines to a file using BufferedWriter.